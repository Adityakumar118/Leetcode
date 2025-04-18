import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int n = s.length();

        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total =0,prev = 0;
        for(int i=n-1;i>=0;i--){
            int curr = romanMap.get(s.charAt(i));

            if(curr<prev){
                total -= curr;
            }else{
                total += curr;
            }
            prev = curr;
        }
        return total;
    }
}