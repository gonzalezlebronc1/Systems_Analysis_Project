// Represents an application with status
class Application {
    private Student student;
    private String status;  // Pending, Accepted, Rejected

    public Application(Student student) {
        this.student = student;
        this.status = "Pending";
    }

    public Student getStudent() { return student; }
    public String getStatus() { return status; }

    public void approve() {
        this.status = "Accepted";
    }

    public void reject() {
        this.status = "Rejected";
    }
}