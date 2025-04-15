class Solution {
    public boolean isAnagram(String s, String t) {
        // s= s.toLowerCase();
        // t = t.toLowerCase();

        //if(s.length()==t.length()){
            char[] s1charArray = s.toCharArray();
            char[] t2charArray = t.toCharArray();

            Arrays.sort(s1charArray);
            Arrays.sort(t2charArray);
            return Arrays.equals(s1charArray,t2charArray);
        // }
        // return false;
    }
}