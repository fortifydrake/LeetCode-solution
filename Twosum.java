
  //Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1=0;
        int num2=0,carry=0;
        ListNode result=new ListNode(0);
        ListNode dummy=result;
        while(l1!=null||l2!=null||carry!=0){
            num1=(l1!=null)?l1.val:0;
            num2=(l2!=null)?l2.val:0;
            int sum=num1+num2+carry;
            int num3=sum%10;
            carry=sum/10;

            ListNode fade=new ListNode(num3);
            dummy.next=fade;
            dummy=dummy.next;

            l1=(l1.next==null)?null:l1.next;
            l2=(l2.next==null)?null:l2.next;
        }
        return result;
    }
}
public class Twosum {
    public static void main(String[] args){
        ListNode l1=new ListNode(9);
        //l1.next=new ListNode(3);
        //l1.next.next=new ListNode(4);
        ListNode l2=new ListNode(1);
        l2.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        Solution s=new Solution();
       ListNode result=s.addTwoNumbers(l1,l2);
       System.out.println("got it ");
       ListNode temp=result.next;
        while(temp.next!=null){
            int val=temp.val;
            temp=temp.next;
            System.out.print(val+" ");
        }
        //System.out.println((int)(20+l1.val*Math.pow(10,1)));
    }
}
