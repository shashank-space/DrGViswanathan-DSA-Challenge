class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Day15insertGreatestCommonDivisors{

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            int gcd = findGCD(current.val, current.next.val);

            ListNode newNode = new ListNode(gcd);
            newNode.next = current.next;
            current.next = newNode;

            current = newNode.next;
        }

        return head;
    }

    // Euclidean Algorithm to find GCD
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
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
        Day15insertGreatestCommonDivisors sol = new Day15insertGreatestCommonDivisors();

        int[] arr = {18, 6, 10, 3};

        ListNode head = createList(arr);

        System.out.print("Original List: ");
        printList(head);

        head = sol.insertGreatestCommonDivisors(head);

        System.out.print("Modified List: ");
        printList(head);
    }
}