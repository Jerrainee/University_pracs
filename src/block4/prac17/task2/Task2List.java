package block4.prac17.task2;

public class Task2List {
    private Task2Student head;
    private Task2Student tail;
    private int size;

    public Task2List() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void add(Task2Student student) {
        if (head == null) {
            head = student;
            tail = student;
        } else {
            tail.next = student;
            student.prev = tail;
            tail = student;
        }
        size++;
    }

    public void remove(int number) {
        Task2Student node = find(number);

        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
        size--;
    }

    private Task2Student find(int number) {
        Task2Student current = head;
        for (int i = 1; i < number; i++) {
            current = current.next;
        }
        return current;
    }

    public void printNode(int number) {
        find(number).print();
    }

    public void printAll() {
        Task2Student current = head;
        int number = 1;
        while (current != null) {
            System.out.print(number + ") ");
            current.print();
            current = current.next;
            number++;
        }
    }

    public void printReverse() {
        Task2Student current = tail;
        int number = size;
        while (current != null) {
            System.out.print(number + ") ");
            current.print();
            current = current.prev;
            number--;
        }
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
