public class LargestAltitude {

    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;  // Başlangıçtaki en yüksek nokta 0
        int currentAltitude = 0;  // Başlangıçta bisikletçi 0 metre yükseklikte

        // gain dizisindeki her bir öğe üzerinden geç
        for (int g : gain) {
            currentAltitude += g;  // Mevcut yüksekliği güncelle
            maxAltitude = Math.max(maxAltitude, currentAltitude);  // En yüksek yüksekliği güncelle
        }

        return maxAltitude;  // En yüksek yüksekliği döndür
    }

    public static void main(String[] args) {
        LargestAltitude solution = new LargestAltitude();

        // Test örneği 1
        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println(solution.largestAltitude(gain1));  // Çıktı: 1

        // Test örneği 2
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println(solution.largestAltitude(gain2));  // Çıktı: 0
    }
}
