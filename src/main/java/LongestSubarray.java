public class LongestSubarray {
    public int longestSubarray(int[] nums) {
        int left = 0; // Pencerenin sol ucu
        int zeroCount = 0; // Pencere içindeki 0 sayısı
        int maxLength = 0; // Maksimum uzunluk

        for (int right = 0; right < nums.length; right++) {
            // Sağ uca eleman ekle
            if (nums[right] == 0) {
                zeroCount++;
            }

            // 0 sayısı 1'den fazla olursa pencereyi daralt
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Mevcut pencerenin uzunluğunu hesapla
            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubarray solution = new LongestSubarray();

        // Test 1
        int[] nums1 = {1, 1, 0, 1};
        System.out.println(solution.longestSubarray(nums1)); // Çıktı: 3

        // Test 2
        int[] nums2 = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(solution.longestSubarray(nums2)); // Çıktı: 5

        // Test 3
        int[] nums3 = {1, 1, 1};
        System.out.println(solution.longestSubarray(nums3)); // Çıktı: 2
    }
}
