public class SecondLargest{
    public int print2largest(int[] arr) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        
        if(arr.length<2)
        return -1;
        
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        
        if(secondLargest==Integer.MIN_VALUE)
        return -1;
        
        return secondLargest;
     }
}