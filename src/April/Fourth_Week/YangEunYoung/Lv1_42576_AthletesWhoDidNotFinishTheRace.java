import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s : completion){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        for(String s : participant){
            if(map.get(s) == null || map.get(s) == 0){
                answer = s;
                break;
            }else{
                map.put(s, map.get(s) - 1);
            }
        }
        
        
        return answer;
    }
}
