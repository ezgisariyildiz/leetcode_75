public class LongestOnes {
    public int longestOnes(int[] nums, int k) {
        int left = 0; // Pencerenin sol ucu
        int maxLength = 0; // Maksimum uzunluk
        int zeroCount = 0; // Pencere içindeki 0 sayısı

        for (int right = 0; right < nums.length; right++) {
            // Sağ uca eleman ekle
            if (nums[right] == 0) {
                zeroCount++;
            }

            // 0 sayısı k'yı aşıyorsa pencereyi daralt
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Mevcut pencerenin uzunluğunu hesapla
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestOnes solution = new LongestOnes();

        // Test 1
        int[] nums1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k1 = 2;
        System.out.println(solution.longestOnes(nums1, k1)); // Çıktı: 6

        // Test 2
        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k2 = 3;
        System.out.println(solution.longestOnes(nums2, k2)); // Çıktı: 10
    }
}
