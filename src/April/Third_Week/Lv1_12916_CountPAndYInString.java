class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        int p = 0;
        int y = 0;
        for(char c : s.toCharArray()){
            if('p' == c) p++;
            if('y' == c) y++;
        }
        
        if(p != y) answer = false;
        
        return answer;
    }
}
