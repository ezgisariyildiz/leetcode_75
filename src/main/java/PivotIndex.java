public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;  // Tüm elemanların toplamı
        int leftSum = 0;   // Sol toplam

        // 1. Adım: Tüm elemanların toplamını hesapla
        for (int num : nums) {
            totalSum += num;
        }

        // 2. Adım: Her elemanı kontrol et
        for (int i = 0; i < nums.length; i++) {
            // Sağ toplamı, şu anki elemanın totalSum'dan çıkarılmasına dayanır
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;  // Pivot index bulundu
            }

            // Sol toplamı güncelle
            leftSum += nums[i];
        }

        // Eğer pivot index bulunmazsa, -1 döndür
        return -1;
    }

    public static void main(String[] args) {
        PivotIndex pivotIndex = new PivotIndex();

        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex.pivotIndex(nums1));

        int[] nums2 = {1, 2, 3};
        System.out.println(pivotIndex.pivotIndex(nums2));

        int[] nums3 = {2, 1, -1};
        System.out.println(pivotIndex.pivotIndex(nums3));
    }
}
