class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Day3RemoveElements {

    static Node remove(Node head, int val) {
        while (head != null && head.data == val)
            head = head.next;

        Node curr = head;

        while (curr != null && curr.next != null) {
            if (curr.next.data == val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }

        return head;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head = remove(head, 6);
        print(head);
    }
}
