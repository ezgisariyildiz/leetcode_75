import java.util.HashMap;

public class MaxOperations1 {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int operations = 0;

        for (int num : nums) {
            int complement = k - num;
            if (map.getOrDefault(complement, 0) > 0) {
                operations++;
                map.put(complement, map.get(complement) - 1); // Kullanıldı
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1); // Sayıyı kaydet
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        MaxOperations1 solution = new MaxOperations1();

        // Test örneği 1
        int[] nums1 = {1, 2, 3, 4};
        int k1 = 5;
        System.out.println(solution.maxOperations(nums1, k1)); // Çıktı: 2

        // Test örneği 2
        int[] nums2 = {3, 1, 3, 4, 3};
        int k2 = 6;
        System.out.println(solution.maxOperations(nums2, k2)); // Çıktı: 1
    }
}

