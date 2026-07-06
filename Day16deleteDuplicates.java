class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Day16deleteDuplicates{

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {

                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }

                prev.next = head.next;
            } else {
                prev = prev.next;
            }

            head = head.next;
        }

        return dummy.next;
    }

    // Create Linked List
    static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Print Linked List
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Day16deleteDuplicates sol = new Day16deleteDuplicates();

        int[] arr = {1, 2, 3, 3, 4, 4, 5};

        ListNode head = createList(arr);

        System.out.print("Original List: ");
        printList(head);

        head = sol.deleteDuplicates(head);

        System.out.print("Modified List: ");
        printList(head);
    }
}