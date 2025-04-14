class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int lft = 0;
        int rgt = words.length-1;

        while(lft<rgt){
            String temp = words[lft];
            words[lft] = words[rgt];
            words[rgt] = temp;

            lft++;
            rgt--;
        }
        StringBuilder result = new StringBuilder();
        for(String word:words){
            if(!word.isEmpty()){
                if(result.length()>0){
                   result.append(" ");
            }
            result.append(word);
            }           
        }
        return result.toString();
    }
}