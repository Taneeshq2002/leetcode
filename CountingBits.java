public class CountingBits {
  
        public int[] countBits(int n) {
            int count=0;
            int res[]=new int[n+1];
    
            for(int i=0;i<=n;i++){
                count=checkBits(i);
                res[i]=count;
            }
    
            return res;
        }
    
        public int checkBits(int num){
            int bitCount=0;
            if(num==0)
            return 0;
    
            while(num>0){
                if((int)(num&1)==1) //Checking if rightmost bit is 1 
                    bitCount++;
                
                num=num>>1; //shifting right by 1 position
            }
    
            return bitCount;
        }

}
