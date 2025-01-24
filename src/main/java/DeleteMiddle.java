public class DeleteMiddle {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // Eğer tek bir düğüm varsa, liste boş kalır.
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Ortadaki düğümü atlıyoruz.
        prev.next = slow.next;

        return head;
    }

    public static void main(String[] args) {
        // Bağlı listeyi oluşturuyoruz: [1,3,4,7,1,2,6]
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);

        DeleteMiddle solution = new DeleteMiddle();
        head = solution.deleteMiddle(head);

        // Listeyi doğrudan burada yazdırıyoruz.
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
