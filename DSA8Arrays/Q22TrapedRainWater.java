package DSA8Arrays;

public class Q22TrapedRainWater {
    public static int TrapedWater(int height[],int Wirdth) {
        //calulate left max boundary-array
        int LeftMax[]=new int[height.length];
        LeftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            LeftMax[i]=Math.max(LeftMax[i-1], height[i]);
        }
        //calulate right max boundary-array
        int RightMax[]=new int[height.length];
        RightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            RightMax[i]=Math.max(RightMax[i+1],height[i]);
        }
        int TrappedWater=0;
        //loop 
        for(int i=0;i<height.length;i++){
            //water level=min(left bound,right bound)
            int WaterLevel=Math.min(LeftMax[i], RightMax[i]);
            //trapped water=waterlevel-height[i]
            TrappedWater+=WaterLevel-height[i];
        }
        int TotalTWArea=TrappedWater*Wirdth;
        return TotalTWArea;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(TrapedWater(height, 1));
    }
} 