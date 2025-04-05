// student.java
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        System.out.println(name + " has enrolled in " + course.getCourseName());
    }
}

