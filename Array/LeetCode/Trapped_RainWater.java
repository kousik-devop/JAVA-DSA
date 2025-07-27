package Array.LeetCode;

public class Trapped_RainWater {

    public int trap(int[] height) {    // In 0ms Runtime

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trapWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax)
                    leftMax = height[left];
                else
                    trapWater += leftMax - height[left];
                left++;
            } else {
                if (height[right] >= rightMax)
                    rightMax = height[right];
                else
                    trapWater += rightMax - height[right];
                right--;
            }
        }

        return trapWater;
        
    }

    public static int trappedWater(int height[]){  // 1ms Runtime

        int n = height.length;
        int ans = 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        for(int i = 0; i < n ; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            ans += waterLevel - height[i];
        }

        return ans;

    }
    public static void main(String[] args) {
        
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped Water : " + trappedWater(arr));

    }
}
