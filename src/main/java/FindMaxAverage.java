public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        // 1. İlk k elemanın toplamını hesapla
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // 2. İlk toplamı maksimum olarak başlat
        int maxSum = windowSum;

        // 3. Kayan pencere ile toplamı güncelle
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i]; // İlk elemanı çıkar, yeni elemanı ekle
            maxSum = Math.max(maxSum, windowSum); // Maksimum toplamı güncelle
        }

        // 4. Maksimum ortalamayı döndür
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        FindMaxAverage solution = new FindMaxAverage();

        // Test 1
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println(solution.findMaxAverage(nums1, k1)); // Çıktı: 12.75

        // Test 2
        int[] nums2 = {5};
        int k2 = 1;
        System.out.println(solution.findMaxAverage(nums2, k2)); // Çıktı: 5.0
    }
}
