package Business.WorkQueue;

import Business.UserAccount.UserAccount;

public class AppointmentRequest extends WorkRequest {

    private UserAccount teacher;
    private UserAccount student;

    public AppointmentRequest(String name, String type, UserAccount requester, UserAccount teacher, String description, String location) {
        super(name, "Appointment Request", description, location, requester);
        this.teacher = teacher;
        this.student = requester; // The requester is the student who created the request
    }

    public UserAccount getTeacher() {
        return teacher;
    }

    public void setTeacher(UserAccount teacher) {
        this.teacher = teacher;
    }

    public UserAccount getStudent() {
        return student;
    }

    public void setStudent(UserAccount student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Appointment Request between " + student.getUsername() + " and " + teacher.getUsername();
    }
}
