import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        // Adım 1: Elemanların tekrar sayılarını hesapla
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Adım 2: Tekrar sayılarını bir sete ekle
        Set<Integer> occurrences = new HashSet<>(frequencyMap.values());

        // Eğer tekrar sayılarının set boyutu, orijinal map'in boyutuyla eşitse benzersizdir
        return frequencyMap.size() == occurrences.size();
    }

    public static void main(String[] args) {
        UniqueOccurrences solution = new UniqueOccurrences();

        // Test 1
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        System.out.println(solution.uniqueOccurrences(arr1)); // true

        // Test 2
        int[] arr2 = {1, 2};
        System.out.println(solution.uniqueOccurrences(arr2)); // false

        // Test 3
        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(solution.uniqueOccurrences(arr3)); // true
    }
}
