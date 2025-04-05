import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(String name, int age) {
        students.add(new Student(name, age));
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public void processStudent(String name, int age) {
        addStudent(name, age);
        displayAllStudents();
        Student found = findStudentByName(name);
        System.out.println("Found: " + (found != null ? found : "Not found"));
    }
}