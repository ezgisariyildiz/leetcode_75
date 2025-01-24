public class ReverseList {
    public class ListNode {
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

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public void main(String[] args) {
        // Başlangıç listemizi oluşturuyoruz
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        // Solution sınıfını oluşturuyoruz
        ReverseList solution = new ReverseList();

        // Orijinal listeyi yazdırıyoruz
        System.out.print("Orijinal Liste: ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();  // Yeni bir satır ekliyoruz

        // Listeyi ters çeviriyoruz
        ListNode reversedHead = solution.reverseList(head);

        // Ters çevrilmiş listeyi yazdırıyoruz
        System.out.print("Ters Çevrilmiş Liste: ");
        current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();  // Yeni bir satır ekliyoruz
    }
}
