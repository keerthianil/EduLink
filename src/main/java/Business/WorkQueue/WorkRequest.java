package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class WorkRequest {
    private static int counter = 0;
    private int id;
    private String name;
    private String type; // Type of the request (e.g., "Tutoring", "Resource", "Workshop")
    private Date requestDate;
    private String status;
    private UserAccount requester;
    private static List<WorkRequest> workRequestList = new ArrayList<>();
    private String location;
    private String description;
    private UserAccount sender;
    private UserAccount receiver;


    // Constructor to initialize the request with message, type, and additional info
    public WorkRequest(String name, String type, String description, String location, UserAccount requester) {
        this.id = ++counter; // Increment ID for each new request
        this.name = name;
        this.type = type;
        this.requestDate = new Date();
        this.status = "Pending"; // Default status
        workRequestList.add(this);
    
        this.location = location;
        this.requester = requester;
        this.description = description;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        WorkRequest.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UserAccount getRequester() {
        return requester;
    }

    public void setRequester(UserAccount requester) {
        this.requester = requester;
    }
    public WorkRequest getWorkRequestById(int requestId) {
        for (WorkRequest request : workRequestList) {
            if (request.getId() == requestId) {
                return request;
            }
        }
        return null;
    }
    
    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }
    


    
    



    @Override
    public String toString() {
        return "Request ID: " + id + ", Name: " + name + ", Type: " + type + ", Status: " + status;
    }
}
