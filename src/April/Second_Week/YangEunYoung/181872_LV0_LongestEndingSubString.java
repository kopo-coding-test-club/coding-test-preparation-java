class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int index = myString.lastIndexOf(pat);
        answer = myString.substring(0, index);
        answer += pat;

        return answer;
    }
}