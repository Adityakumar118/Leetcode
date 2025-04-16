// class Solution {
//     public int fib(int n) {
//         if(n==0 ||n==1){
//             return n;
//         }
//         int fnm2 = fib(n-2);
//         int fnm1 = fib(n-1);
//         return fnm1+fnm2;
//     }
// }
class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}