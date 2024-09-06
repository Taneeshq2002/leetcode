import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        boolean flag=true;
        HashMap<Character,Integer>ransom=new HashMap<Character,Integer>();
        HashMap<Character,Integer>mag=new HashMap<Character,Integer>();
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(ransom.containsKey(ch)){
                ransom.put(ch,ransom.get(ch)+1);
            }else{
                ransom.put(ch,1);
            }
        }
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(mag.containsKey(ch)){
                mag.put(ch,mag.get(ch)+1);
            }else{
                mag.put(ch,1);
            }
        }

     for(Character ch:ransom.keySet()){
        if(mag.containsKey(ch)){
            if(ransom.get(ch)<=mag.get(ch)){
                continue;
            }
            flag=false;
        }
        else{
            flag=false;
            break;
        }
     }

        return flag;
    }
}
