public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length; //Dizinin uzunluğunu alıyoruz
        for (int i = 0; i < length; i++) { //Her indisi kontrol ediyoruz
            if (flowerbed[i] == 0){ //Eğer indis sıfırsa
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0); // İndisin sol tarafı uygun mu
                boolean rightEmpty = (i == length - 1 || flowerbed[i + 1] == 0); // İndisin sağ tarafı uygun mu

                if (leftEmpty && rightEmpty){ //Eğer iki tarfta uygunsa
                    flowerbed[i] = 1; // Çiçeği ekiyoruz
                    n--; // Gerekli çiçek sayısını azaltıyoruz
                }
            }
            if (n <= 0){ //Eğer tüm çiçekler ekildiyse
                return true;
            }
        }
        return n <= 0; // Çiçek ekilmediyse false
    }
    public static void main(String[] args) {
        CanPlaceFlowers obj = new CanPlaceFlowers();

        // Test senaryoları
        System.out.println(obj.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)); // Output: true
        System.out.println(obj.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)); // Output: false
    }

}
