// Universitysystem.java
public class UniversitySystem {
    public void processMajorChange(Student student, String newMajor) {
        if (approveMajorChange(student, newMajor)) {
            student.updateMajor(newMajor);
        } else {
            System.out.println("Major change request denied for " + student.getMajor());
        }
    }
    
    private boolean approveMajorChange(Student student, String newMajor) {
        // Placeholder logic for approval
        return !newMajor.equalsIgnoreCase(student.getMajor());
    }
}
