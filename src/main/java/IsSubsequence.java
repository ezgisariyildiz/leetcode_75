public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0; // s'nin karakterlerini takip etmek için
        int tIndex = 0; // t'nin karakterlerini takip etmek için

        // t dizisinin sonuna kadar git ve s'nin karakterlerini sırayla kontrol et
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                // s'nin bir karakteri t'de bulundu, bir sonrakine geç
                sIndex++;
            }
            // t'de bir sonraki karaktere geç
            tIndex++;
        }

        // Eğer sIndex, s'nin uzunluğuna ulaştıysa, tüm karakterler bulundu demektir
        return sIndex == s.length();
    }

    public static void main(String[] args) {
        IsSubsequence solution = new IsSubsequence();

        // Test 1
        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println(solution.isSubsequence(s1, t1)); // true

        // Test 2
        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println(solution.isSubsequence(s2, t2)); // false
    }
}
