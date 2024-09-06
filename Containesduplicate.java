import java.util.HashMap;

public class Containesduplicate {
  
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>Store=new HashMap<>();
        for(int num:nums){
            if(Store.containsKey(num)==true){
                return true;
            }
            else{
                Store.put(num,1);
            }
        }
        return false;
    }

}
