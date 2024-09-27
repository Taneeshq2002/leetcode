public class MinBitFlipstoConvertNumber {
    public int minBitFlips(int start, int goal) {
        int flips=0;
        int n=start^goal;

        while(n!=0){
            flips++;
            n=n&(n-1);
        }

        return flips;
    }
}
