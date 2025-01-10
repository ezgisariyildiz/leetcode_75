import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {
    public List<Boolean> kidsWithCandies ( int[] candies, int extraCandies){
        // Maximum şeker sayısını bulmaya çalışıyoruz
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Sonuç listesi oluşturyoruz
        List<Boolean> result = new ArrayList<>();

        // Her çocuğun şeker sayısını kontrol ediyoruz
        for (int candy : candies) {
            // Her çocuğun şeker sayısına extraCandies eklenerek toplam değeri hesaplıyoruz
            // Eğer bu değer maxCandies değerine eşit veya büykse true, değilse false yazdırıyoruz
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }

// Test için ana fonksiyon
    public static void main (String[]args){
        KidsWithGreatestCandies solution = new KidsWithGreatestCandies();

        // Test örnekleri
        System.out.println(solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3)); // Çıktı: [true, true, true, false, true]
        System.out.println(solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1)); // Çıktı: [true, false, false, false, false]
        System.out.println(solution.kidsWithCandies(new int[]{12, 1, 12}, 10));   // Çıktı: [true, false, true]
    }
}