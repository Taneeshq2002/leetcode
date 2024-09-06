public class ArrangingCoins {

        public int arrangeCoins(int n) {
            int rowCount=0;
            int i=1;
            while(n>0){
                if(n-i>=0){
                    rowCount+=1;
                   
                }
                 n=n-i;
                i++;
            }
    
            return rowCount;
        }
}
