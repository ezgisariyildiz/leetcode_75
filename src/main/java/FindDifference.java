import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // nums1 ve nums2 elemanlarını set1 ve set2'ye ekle
        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        // Farkları bul
        List<Integer> diff1 = new ArrayList<>(set1);
        diff1.removeAll(set2); // set1'de olup set2'de olmayanlar

        List<Integer> diff2 = new ArrayList<>(set2);
        diff2.removeAll(set1); // set2'de olup set1'de olmayanlar

        // Sonuç listesi oluştur
        List<List<Integer>> result = new ArrayList<>();
        result.add(diff1);
        result.add(diff2);

        return result;
    }

    public static void main(String[] args) {
        FindDifference solution = new FindDifference();

        // Test 1
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(solution.findDifference(nums1, nums2));

        // Test 2
        int[] nums3 = {1, 2, 3, 3};
        int[] nums4 = {1, 1, 2, 2};
        System.out.println(solution.findDifference(nums3, nums4));
    }
}
