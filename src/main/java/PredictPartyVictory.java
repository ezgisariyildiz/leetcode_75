import java.util.LinkedList;
import java.util.Queue;

public class PredictPartyVictory {
    public String predictPartyVictory(String senate) {
        // Radiant ve Dire senatörleri için kuyruk oluştur
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        // Senatörleri ilgili kuyruklara sırayla ekle
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }

        // Kuyruklar tamamen boşalana kadar tur döngüsü
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            // İki senatörün pozisyonlarını al
            int rIndex = radiant.poll();
            int dIndex = dire.poll();

            // Hangisi daha önceyse, o diğerini etkisiz hale getirir
            if (rIndex < dIndex) {
                radiant.add(rIndex + senate.length()); // Radiant yeniden oy kullanır
            } else {
                dire.add(dIndex + senate.length()); // Dire yeniden oy kullanır
            }
        }

        // Hangi tarafın kuyruğu doluysa, o taraf kazanır
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        PredictPartyVictory pv = new PredictPartyVictory();
        System.out.println(pv.predictPartyVictory("R"));
        System.out.println(pv.predictPartyVictory("RD"));
        System.out.println(pv.predictPartyVictory("RDD"));
        System.out.println(pv.predictPartyVictory("DDRR"));
    }

}
