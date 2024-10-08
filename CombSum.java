import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombSum {
  
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
        
    }
     private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
      if(remain < 0) return;
      else if(remain == 0) list.add(new ArrayList<>(tempList));
      else{ 
          for(int i = start; i < nums.length; i++){
              tempList.add(nums[i]);
              backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
              tempList.remove(tempList.size() - 1);
          }
      }
     }

}
