import java.util.*;

class Solution {
    public List<String> solution(String myString) {
        List<String> list = new ArrayList<>();
        String str = "";
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                if(!str.equals("")) list.add(str);
                str = "";
            }else{
                str += String.valueOf(myString.charAt(i));
            }
        }
        
        if(!str.equals(""))list.add(str);
        
        Collections.sort(list);
        
        return list;
    }
}
