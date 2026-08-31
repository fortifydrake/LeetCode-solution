import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class leetcode2058{
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next==null)return new int[]{-1,-1};
        List<Integer> arr = new ArrayList<>();
        ListNode pre = head;
        ListNode curr = head.next;
        ListNode post = head.next.next;
        int k = 2;
        //int p = 0;
        int min = Integer.MAX_VALUE;;
        while(post!=null){
            if((pre.val<curr.val&&curr.val>post.val)||(pre.val>curr.val&&curr.val<post.val)){
            
                if(arr.size()>=1){
                    min = Math.min(min,k-arr.get(arr.size()-1));
                }
                //p=k;
                arr.add(k);
            }
            k++;
            pre = pre.next;
            curr = curr.next;
            post = post.next;
        }
        if(arr.size()<=1) return new int[]{-1,-1};

        int[] result = new int[2];
        result[1] = arr.get(arr.size()-1) - arr.get(0);
        result[0] = min;
        return result;
    }
    public static void main(String[] args){
        // Test case: 5->3->1->2->5->1->2
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);
        
        int[] result = nodesBetweenCriticalPoints(head);
        System.out.println("Minimum distance: " + result[0]);
        System.out.println("Maximum distance: " + result[1]);
    }
}