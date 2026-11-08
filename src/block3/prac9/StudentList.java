package block3.prac9;

public class StudentList {
    Student head;

    public void add(Student student) {
        if (head == null) {
            head = student;
        } else {
            Student current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = student;
        }
    }

    public void print() {
        Student current = head;
        while (current != null) {
            current.print();
            current = current.next;
        }
    }

    public void sort() {
        head = mergeSort(head);
    }

    // делим пополам, сортируем части, сливаем
    private static Student mergeSort(Student first) {
        if (first == null || first.next == null) {
            return first;
        }
        Student middle = findMiddle(first);
        Student second = middle.next;
        middle.next = null;
        return merge(mergeSort(first), mergeSort(second));
    }

    private static Student findMiddle(Student first) {
        Student slow = first;
        Student fast = first.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // слияние
    private static Student merge(Student a, Student b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.compareTo(b) <= 0) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }

    public static StudentList mergeLists(StudentList first, StudentList second) {
        first.sort();
        second.sort();
        StudentList result = new StudentList();
        result.head = merge(first.head, second.head);
        return result;
    }
}
