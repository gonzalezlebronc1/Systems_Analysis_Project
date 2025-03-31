//Represents a student applying to the university

class Student {

    private String name;

    private int age;

    private String email;

    private String major;


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


    public void requestMajorChange(String newMajor, UniversitySystem system) {

        system.processMajorChange(this, newMajor);

    }


    public void updateMajor(String newMajor) {

        this.major = newMajor;

        System.out.println(name + " has successfully changed their major to " + newMajor);

    }

}