public class LongestContinuousIncreasingSubarray {
    public int findLengthOfLCIS(int[] nums) {
        int maxLen=1;

        for(int i=0;i<nums.length-1;i++){
            int len=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<=nums[j-1]){
                    len=j-i;
                    break;
                }
                if(j==nums.length-1){
                    len=j-i+1;
                    break;
                }
            }
            if(len>maxLen){
                maxLen=len;
            }
        }

        return maxLen;
    }
}
