class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String re = my_string.substring(s, e + 1);
        String reverseSt = new StringBuffer(re).reverse().toString();
        
        answer = my_string.substring(0, s) + reverseSt + my_string.substring(e + 1);
            
        return answer;
    }
}
