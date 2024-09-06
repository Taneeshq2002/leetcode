public class FirstUniqueChar {
        public int firstUniqChar(String s) {
            int idx=s.length()-1;
            boolean flag1=false;
            boolean flag2=false;
            for(int i=0;i<s.length();i++){
                flag1=false;
                char ch=s.charAt(i);
                for(int j=0;j<s.length();j++){
                    if(i==j)
                    continue;
                    if(ch==s.charAt(j)){
                        flag1=true;
                    break;
                    }
                }
                if(!flag1){
                    idx=Math.min(idx,i);
                    flag2=true;
                }
            }
            if(!flag2){
                return -1;
            }
    
            return idx;
        }
}
