import java.util.ArrayList;

import java.util.List;


class Student {

    private String name;

    private int age;

    private String email;

    private String major;

    private List<Course> enrolledCourses = new ArrayList<>();


    public Student(String name, int age, String email, String major) {

        this.name = name;

        this.age = age;

        this.email = email;

        this.major = major;

    }


    public String getName() { return name; }

    public int getAge() { return age; }

    public String getEmail() { return email; }

    public String getMajor() { return major; }


    // Major change

    public void requestMajorChange(String newMajor, UniversitySystem system) {

        system.processMajorChange(this, newMajor);

    }


    public void updateMajor(String newMajor) {

        this.major = newMajor;

        System.out.println(name + " has changed major to " + newMajor);

    }


    // Enroll in course

    public void enrollInCourse(Course course) {

        enrolledCourses.add(course);

        System.out.println(name + " has enrolled in " + course.getCourseName());

    }

}