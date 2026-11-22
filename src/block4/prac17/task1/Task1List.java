package block4.prac17.task1;

public class Task1List {
    private Task1Student head;
    private int size;

    public Task1List() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void add(Task1Student student) {
        if (head == null) {
            head = student;
        } else {
            Task1Student current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = student;
        }
        size++;
    }

    public void remove(int number) {
        if (number == 1) {
            head = head.next;
        } else {
            Task1Student previous = head;
            for (int i = 1; i < number - 1; i++) {
                previous = previous.next;
            }
            previous.next = previous.next.next;
        }
        size--;
    }

    public void printNode(int number) {
        Task1Student current = head;
        for (int i = 1; i < number; i++) {
            current = current.next;
        }
        current.print();
    }

    public void printAll() {
        Task1Student current = head;
        int number = 1;
        while (current != null) {
            System.out.print(number + ") ");
            current.print();
            current = current.next;
            number++;
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }
}
