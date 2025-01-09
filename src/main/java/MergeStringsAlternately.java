public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        // Sonucu tutmak için bir StringBuilder oluşturuyoruz
        StringBuilder merged = new StringBuilder();

        // İki string için başlangıç indeksleri
        int i = 0, j = 0;

        // Hem word1 hem de word2'deki karakterleri sırayla ekle
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++)); // word1'den bir karakter ekle
            merged.append(word2.charAt(j++)); // word2'den bir karakter ekle
        }

        // word1'de kalan karakterleri ekle
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }

        // word2'de kalan karakterleri ekle
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }

        // Sonucu string olarak döndür
        return merged.toString();
    }

    public static void main(String[] args) {
        String result = mergeAlternately("abc", "pqr");
        System.out.println(result); // Beklenen çıktı: "apbqcr"
    }
}
