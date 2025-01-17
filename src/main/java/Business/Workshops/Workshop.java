package Business.Workshops;

import java.util.ArrayList;
import java.util.Date;

import Business.UserAccount.UserAccount;

public class Workshop {
    private String name;
    private String location;
    private String conductedBy; // Can be NGO, Teacher, or Corporate Person
    private String description; // Description of the workshop
    private Date date; // Date when the workshop is held
    private String status; // Status of the workshop (Pending, Active, Completed)
    private String targetAudience; // Target audience (e.g., Students, Teachers, etc.)
    private ArrayList<UserAccount> attendees; // List of attendees for the workshop

    // Updated constructor to include date, status, and targetAudience
    public Workshop(String name, String location, String conductedBy, String description, Date date, String status, String targetAudience) {
        this.name = name;
        this.location = location;
        this.conductedBy = conductedBy;
        this.description = description;
        this.date = date;
        this.status = status;
        this.targetAudience = targetAudience;
        this.attendees = new ArrayList<>();

    }

    // Getters and Setters for the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getConductedBy() {
        return conductedBy;
    }

    public void setConductedBy(String conductedBy) {
        this.conductedBy = conductedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public ArrayList<UserAccount> getAttendees() {
        return attendees;
    }

    public void setAttendees(ArrayList<UserAccount> attendees) {
        this.attendees = attendees;
    }

    public void addAtendees(UserAccount student) {
        this.attendees.add(student);
    }

    @Override
    public String toString() {
        return "Workshop Name: " + name + ", Location: " + location + ", Conducted By: " + conductedBy + 
               ", Description: " + description + ", Date: " + date.toString() + ", Status: " + status + 
               ", Target Audience: " + targetAudience;
    }
}
