import java.util.Arrays;

public class MissingNumber {
  
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int res=0;
    if(nums[0]!=0)
    return 0;
    if(nums[nums.length-1]!=nums.length)
    return nums.length;
        for(int i=0;i<=nums.length;i++){
            if(nums[i]!=i){
            res=i;
break;
            }
        }

        return res;
    }
}
