public class ReverseVowelsofString {

        public String reverseVowels(String s) {
            StringBuilder res=new StringBuilder(s);
            int i=0;
            int j=s.length()-1;
    
            while(i<j){
                if(isVowel(s.charAt(i))){
                    while(!(isVowel(s.charAt(j)))&&j>i){
                        j--;
                    }
                    char temp1=s.charAt(i);
                    char temp2=s.charAt(j);
                    res.setCharAt(i,temp2);
                    res.setCharAt(j,temp1);
                    j--;
                }
                else{
                    res.setCharAt(i,s.charAt(i));
                }
                i++;
            }
    
            return res.toString();
        }
    
        public boolean isVowel(char c){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
    
            return false;
        }

}
