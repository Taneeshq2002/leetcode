public class AddDigits {

        public int addDigits(int num) {
            int digit=0,n=0;
            while(num>0){
                digit=num%10;
                n=n+digit;
                num=num/10;
                if(num==0){
                    if(n>9){
                        num=n;
                        n=0;
                    }
                    else {
                    break;
                }
                }
                
            }
    
            return n;
        }
    
}
