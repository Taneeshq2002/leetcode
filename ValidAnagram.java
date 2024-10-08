import java.util.Arrays;

public class ValidAnagram {
 
    public boolean isAnagram(String s, String t) {
        char s1[]=s.toCharArray();
        char s2[]=t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        if(s.length()!=t.length()){
            return false;
        }
    
        for(int i=0;i<s.length();i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }
}
