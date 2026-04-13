class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String num = String.valueOf(x);
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(sum);
        if(x % sum == 0) answer = true;
        else answer = false;

        return answer;
    }
}