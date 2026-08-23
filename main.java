class Student {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class Main {

    static void display(Student s) {
        System.out.println("Name: " + s.name);
        System.out.println("Mark: " + s.mark);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Vicky", 90);

        display(student1);
    }
}