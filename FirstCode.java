public class FirstCode {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // only add method
    public void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
        }
        Node temp = head;
        // traverse the list until you find the last node
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;

        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("List is empty, cannot remove first element.");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = null;
            tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty, cannot remove last element.");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = null;
            tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Search using iteration
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found at index: " + i);
                return i;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("Not found");
        return -1;
    }

    // Cycle detection
    public boolean detectCycle() {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Cycle detected");
                removeCycle(head, slow);
                return true;
            }
        }
        return false;
    }

    void removeCycle(Node head, Node meetingPoint) {
        // start pointer from the head
        // and use the meeting point from the cycle
        Node start = head;

        // Move both pointers one step at a time
        // until they meet again
        // This will be the start of the cycle

        while (start != meetingPoint) {
            start = start.next;
            meetingPoint = meetingPoint.next;
        }

        // Now 'start' is the start of the cycle
        Node temp = start;
        while (temp.next != start) {
            temp = temp.next;
        }
        temp.next = null; // Remove the cycle
        System.out.println("Cycle removed");

    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {

        // FirstCode list = new FirstCode();

        // list.addFirst(10);
        // list.addFirst(20);
        // list.print();
        // list.addLast(30);
        // list.addLast(40);
        // list.print();
        // list.addMiddle(2, 25);
        // list.print();
        // System.out.println("Size of the list: " + size);
        // list.removeFirst();
        // list.print();
        // System.out.println("Size of the list after removing first element: " + size);
        // list.removeLast();
        // list.print();
        // System.out.println("Size of the list after removing last element: " + size);
        // list.itrSearch(25);
        // list.itrSearch(50);
        // list.add(50);
        // list.print();
        // System.out.println("Size of the list after adding 50: " + size);
        // System.out.println(list.detectCycle());

        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Creating a cycle for testing

        FirstCode list = new FirstCode();
        list.head = head;
        // list.print();
        System.out.println("Cycle detected: " + list.detectCycle());

    }
}