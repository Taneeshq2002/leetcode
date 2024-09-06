import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    
    public List<Integer> findDuplicates(int[] nums) {
        int arr[]=new int[nums.length+1];
        List<Integer>res=new ArrayList<>();

        for(int i:nums){
            if(++arr[i]>1)
            res.add(i);
        }

        return res;
    }
}
