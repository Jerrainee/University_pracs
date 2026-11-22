package block4.prac17.task3;

public class Task3List {
    private Task3Student head;
    private Task3Student tail;
    private int size;

    public Task3List() {
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

    public void add(Task3Student student) {
        if (head == null) {
            head = student;
        } else {
            tail.next = student;
        }
        tail = student;
        tail.next = head; // замыкаем круг
        size++;
    }

    public void remove(int number) {
        if (size == 1) {
            head = null;
            tail = null;
        } else if (number == 1) {
            head = head.next;
            tail.next = head;
        } else {
            Task3Student previous = head;
            for (int i = 1; i < number - 1; i++) {
                previous = previous.next;
            }
            Task3Student target = previous.next;
            previous.next = target.next;
            if (target == tail) {
                tail = previous;
            }
        }
        size--;
    }

    public void printNode(int number) {
        Task3Student current = head;
        for (int i = 1; i < number; i++) {
            current = current.next;
        }
        current.print();
    }

    public void printAll() {
        Task3Student current = head;
        for (int number = 1; number <= size; number++) {
            System.out.print(number + ") ");
            current.print();
            current = current.next;
        }
    }

    public void printTwoRounds() {
        Task3Student current = head;
        for (int i = 1; i <= size * 2; i++) {
            System.out.print(i + ") ");
            current.print();
            current = current.next;
        }
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
