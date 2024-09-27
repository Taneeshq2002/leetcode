import java.util.HashMap;

public class NumberofConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int ConsistentStrings=0;

        HashMap<Character,Integer>allowedChars=new HashMap<>();
        for(char c:allowed.toCharArray()){
            if(allowedChars.containsKey(c)){
                allowedChars.put(c,allowedChars.get(c)+1);
            }
            else{
                allowedChars.put(c,1);
            }
        }
       
        for(String s:words){
             boolean flag=true;
             for(char c:s.toCharArray()){
                if(!allowedChars.containsKey(c)){
                    flag=false;
                    break;
                }
             }

             if(flag==true){
                ConsistentStrings++;
             }
        }

        return ConsistentStrings;
    }
}
