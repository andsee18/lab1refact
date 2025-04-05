// StudentManager.java - Управление студентами
public class StudentManager {
    String students[] = new String[100];
    int count = 0;

    public void add(String name, int age) {
        students[count] = name + " " + age;
        count++;
    }

    public void show() {
        for(int i = 0; i < count; i++) {
            System.out.println("Student: " + students[i]);
        }
    }

    public String find(String n) {
        for(int i = 0; i < count; i++) {
            if(students[i].contains(n)) {
                return students[i];
            }
        }
        return "Not found";
    }

    public void doAll(String name, int age) {
        add(name, age);
        show();
        System.out.println("Found: " + find(name));
    }
}