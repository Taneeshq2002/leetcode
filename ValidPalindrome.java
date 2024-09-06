public class ValidPalindrome {
        public boolean isPalindrome(String s) {
            String s1=s.toLowerCase();
            StringBuilder s2=new StringBuilder("");
            int j=0;
            for(int i=0;i<s1.length();i++){
                if(Character.isLetter(s1.charAt(i))||Character.isDigit(s1.charAt(i))){
                    s2.insert(j,s1.charAt(i));
                    j++;
                }
            }
            int i=0;
         j=s2.length()-1;
           while(i<=j){
            if(s2.charAt(i)!=s2.charAt(j))
            return false;
            i++;
            j--;
           }
            return true;
        }
    
}
