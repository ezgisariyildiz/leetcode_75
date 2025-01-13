public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        IncreasingTriplet tripletChecker = new IncreasingTriplet();

        int[] nums1 = new int[]{1,2,3,4,5};
        System.out.println(tripletChecker.increasingTriplet(nums1));

        int[] nums2 = new int[]{5,7,8,3,2};
        System.out.println(tripletChecker.increasingTriplet(nums2));

        int[] nums3 = new int[]{4,3,2,1};
        System.out.println(tripletChecker.increasingTriplet(nums3));
    }
}
