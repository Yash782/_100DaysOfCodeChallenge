package Day_70;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }
    public static int maxArea(int[] height) {
        int n = height.length, l = 0, r = n-1, maxArea = 0;
        while(l < r) {
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r-l));
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }
}
