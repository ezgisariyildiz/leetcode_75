public class GreatestCommonDivisorofStrings {

    // İki sayının en büyük ortak bölenini hesaplayan yardımcı fonksiyon
    public String gcdOfStrings(String str1, String str2) {
        // str1 ve str2'nin uzunluklarının en büyük ortak bölenini hesaplıyoruz
        int gcd = gcd(str1.length(), str2.length());

        // GCD uzunluğuna sahip bir alt string oluşturuyoruz
        String candidate = str1.substring(0, gcd);

        // Bu alt string'in str1 ve str2'yi tam olarak bölüp bölmediğini kontrol ediyoruz
        if (str1.equals(candidate.repeat(str1.length() / gcd)) && str2.equals(candidate.repeat(str2.length() / gcd))) {
            return candidate; // Eğer bölüyorsa, bu string'i döndürüyoruz
        }

        return ""; // Eğer böyle bir string yoksa, boş bir string döndürüyoruz
    }

    // İki sayının en büyük ortak bölenini hesaplayan fonksiyon
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // Sonuç olarak en büyük ortak böleni döndürüyoruz
    }

    // Test için main fonksiyonu
    public static void main(String[] args) {
        GreatestCommonDivisorofStrings solution = new GreatestCommonDivisorofStrings();

        // Test örnekleri
        System.out.println(solution.gcdOfStrings("ABCABC", "ABC"));  // Çıktı: "ABC"
        System.out.println(solution.gcdOfStrings("ABABAB", "ABAB")); // Çıktı: "AB"
        System.out.println(solution.gcdOfStrings("LEET", "CODE"));   // Çıktı: ""
    }
}
