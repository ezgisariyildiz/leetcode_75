import java.util.Set;

public class MaxVowels {
    public int maxVowels(String s, int k) {
        // 1. Ünlü harfleri tanımla
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        // 2. İlk pencerenin ünlü harf sayısını hesapla
        int currentVowelCount = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentVowelCount++;
            }
        }

        // 3. Maksimum ünlü harf sayısını başlat
        int maxVowelCount = currentVowelCount;

        // 4. Kayan pencereyi sağa kaydır
        for (int i = k; i < s.length(); i++) {
            // Soldaki karakteri çıkar
            if (vowels.contains(s.charAt(i - k))) {
                currentVowelCount--;
            }
            // Sağdaki karakteri ekle
            if (vowels.contains(s.charAt(i))) {
                currentVowelCount++;
            }
            // Maksimum değeri güncelle
            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
        }

        // 5. Sonucu döndür
        return maxVowelCount;
    }

    public static void main(String[] args) {
        MaxVowels solution = new MaxVowels();

        // Test 1
        String s1 = "abciiidef";
        int k1 = 3;
        System.out.println(solution.maxVowels(s1, k1)); // Çıktı: 3

        // Test 2
        String s2 = "aeiou";
        int k2 = 2;
        System.out.println(solution.maxVowels(s2, k2)); // Çıktı: 2

        // Test 3
        String s3 = "leetcode";
        int k3 = 3;
        System.out.println(solution.maxVowels(s3, k3)); // Çıktı: 2
    }
}
