public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currrentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currrentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();

        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(container.maxArea(height1));

        int[] height2 = {1, 1};
        System.out.println(container.maxArea(height2));
    }
}
