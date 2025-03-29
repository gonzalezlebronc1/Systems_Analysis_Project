// student.java
public class Student {
    private String name;
    private String major;
    
    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void requestMajorChange(String newMajor, UniversitySystem system) {
        system.processMajorChange(this, newMajor);
    }
    
    public void updateMajor(String newMajor) {
        this.major = newMajor;
        System.out.println(name + " has changed major to " + newMajor);
    }
}
