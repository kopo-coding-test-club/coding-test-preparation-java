class Solution {
    public int[] solution(int n, int m) {
        
        if(n < m){
            int tmp = m;
            m = n;
            n = tmp;
        }
        int a = n;
        int b = m;
        while(b != 0){
            int mod = a % b;
            a = b;
            b = mod;
        }
        int result1 = a;
        int result2 = n * m / a;
        int[] answer = {result1, result2};
        return answer;
    }
}
