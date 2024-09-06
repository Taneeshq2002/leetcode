
public class ContainerMostWater {
    public int maxArea(int[] height) {
       int l=0;
       int r=height.length-1;
       int maxVol=0;
       while(l<r){
        maxVol=Math.max(maxVol,Math.min(height[l],height[r])*(r-l));
        if(height[l]<height[r]){
            l+=1;
        }
        else{
            r-=1;
        }
       }
       return maxVol;
    }
}