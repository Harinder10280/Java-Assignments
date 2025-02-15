import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class PrerequisiteNotMetException extends Exception {
    public PrerequisiteNotMetException(String message) {
        super(message);
    }
}

public class UniversityEnrollment {
    private static final int MAX_ENROLLMENT = 2;
    private static List<String> enrolledCourses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enroll in Course: ");
        String course = scanner.nextLine();
        System.out.print("Prerequisite: ");
        String prerequisite = scanner.nextLine();
        try {
            enrollStudent(course, prerequisite);
            System.out.println("Enrollment successful for: " + course);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }

    private static void enrollStudent(String course, String prerequisite) throws CourseFullException, PrerequisiteNotMetException {
        if (enrolledCourses.size() >= MAX_ENROLLMENT) {
            throw new CourseFullException("Course is full.");
        }
        if (!"Core Java".equals(prerequisite)) {
            throw new PrerequisiteNotMetException("Complete Core Java before enrolling in " + course + ".");
        }
        enrolledCourses.add(course);
    }
}
