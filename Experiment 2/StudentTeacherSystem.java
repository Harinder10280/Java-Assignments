import java.util.Scanner;

abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayDetails();
}

class Student extends Person {
    int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class StudentTeacherSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Add Student:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        Student student = new Student(studentName, studentAge, rollNumber);
        
        System.out.println("Add Teacher:");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        
        Teacher teacher = new Teacher(teacherName, teacherAge, subject);
        
        student.displayDetails();
        teacher.displayDetails();
    }
}
