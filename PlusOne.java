import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int j=digits.length-1;
                if(digits[j]==9){
                   while(digits[j]==9){
                    digits[j]=0;
                    j--;
                    if(j<0){
                        int temp[]=new int[digits.length+1];
                        Arrays.fill(temp,0);
                        temp[0]=1;
                        digits=temp;
                        break;
                    }
                   }
                   if(j>=0){
                    digits[j]+=1;
                   }
                }
                else{
                    digits[digits.length-1]+=1;

                }

                return digits;
        
    }

}
