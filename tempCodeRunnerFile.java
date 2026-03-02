count=comp(word,beginWord,count);
            if(word.equals(endWord)){
                return count;
            }
            System.out.println(count+" "+word+" "+beginWord);
            beginWord=word;