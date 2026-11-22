package block4.prac19.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LabClass {

    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public int size() {
        return students.size();
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }

    public void sortStudentsByGpa() {
        Collections.sort(students);
    }

    public Student findStudentByFio(String fio) throws EmptyStringException, StudentNotFoundException {
        if (fio == null || fio.trim().isEmpty()) {
            throw new EmptyStringException("пустая строка");
        }

        String search = fio.trim().toLowerCase();
        for (Student s : students) {
            if (s.getFullName().toLowerCase().contains(search)) {
                return s;
            }
        }

        throw new StudentNotFoundException("не найден");
    }
}
