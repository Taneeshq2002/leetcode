import java.util.HashSet;

public class ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();

        int n1=nums1.length;
        int n2=nums2.length;

        if(n1>=n2){
            for(int i=0;i<n1;i++){
                for(int j=0;j<n2;j++){
                    if(nums1[i]==nums2[j]){
                        set.add(nums1[i]);
                        break;
                    }
                }
            }
        }

         if(n1<n2){
            for(int i=0;i<n2;i++){
                for(int j=0;j<n1;j++){
                    if(nums1[j]==nums2[i]){
                        set.add(nums2[i]);
                        break;
                    }
                }
            }
        }

        int res[]=new int[set.size()];
        int k=0;
        for(int num:set){
            res[k]=num;
            k++;
        }

        return res;
    }
}
