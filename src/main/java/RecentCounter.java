import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    //Son 3000 ms içindeki kayıtları tutar
    private Queue<Integer> queue;

    public RecentCounter() {
        //Boş bir kuyruk oluşturur
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        //Yeni gelen isteği kuyruğa ekler
        queue.add(t);
        //Kuyruğun başındaki eski zamanlı istekleri çıkarır
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            //Kuyruğun başından eleman çıkarır
            queue.poll();
        }
        //Kuyrukta kalan eleman sayısnı döndürür
        return queue.size();
    }

    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();
        System.out.println(rc.ping(1));
        System.out.println(rc.ping(100));
        System.out.println(rc.ping(3001));
        System.out.println(rc.ping(3002));
    }
}
