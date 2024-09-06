public class isSubSequence {

        public boolean isSubsequence(String s, String t) {
            if(s.length()==0){
                return true;
            }
            int si=0;
            int ti=0;
            while(si<s.length()&&ti<t.length()){
                if(s.charAt(si)==t.charAt(ti)){
                    si++;
                    ti++;
                }
                else{
                    ti++;
                }
            }
            if(si>=s.length()){
                return true;
            }
    
            return false;
        }
}
