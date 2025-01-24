public class OddEvenList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            // Liste boş veya tek elemanlıysa, işlem yapmadan döndür.
            return head;
        }

        // 1. "Tek" ve "Çift" gruplarını başlat
        ListNode odd = head;          // İlk düğüm "tek" grubun başlangıcı
        ListNode even = head.next;    // İkinci düğüm "çift" grubun başlangıcı
        ListNode evenHead = even;     // Çift grubun başlangıcını sakla

        // 2. Listeyi sırayla gez
        while (even != null && even.next != null) {
            odd.next = even.next;     // Tek grup bir sonraki tek düğüme bağlanır
            odd = odd.next;           // "Tek" grubu ilerlet
            even.next = odd.next;     // Çift grup bir sonraki çift düğüme bağlanır
            even = even.next;         // "Çift" grubu ilerlet
        }

        // 3. "Tek" grubun sonuna "Çift" grubun başlangıcını bağla
        odd.next = evenHead;

        // 4. Sonuç olarak baş düğümü döndür
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        OddEvenList oddEvenList = new OddEvenList();
        ListNode result = oddEvenList.oddEvenList(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}
