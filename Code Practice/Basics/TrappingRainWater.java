public class TrappingRainWater{

    public static int trappedRainWater(int height[]){
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedRainWater = 0;

        for (int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            trappedRainWater += waterLevel - height[i];
        }
        return trappedRainWater;
    }
    /*
          6 |             █
          5 |             █   ~   ~   █
          4 | █   ~   ~   █   ~   ~   █
          3 | █   ~   ~   █   █   ~   █
          2 | █   █   ~   █   █   █   █
          1 | █   █   ~   █   █   █   █
          0 +---------------------------
              0   1   2   3   4   5   6
    */

    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        int trappedWater = trappedRainWater(height);

        System.out.println("the trappedWater is: " + trappedWater);
    }
}