package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Business.Role.StudentRole;

public class WorkQueue {
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        this.workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void addWorkRequest(WorkRequest request) {
        workRequestList.add(request);
    }

    public void removeWorkRequest(WorkRequest request) {
        workRequestList.remove(request);
    }

    public WorkRequest getWorkRequestById(int id) {
        for (WorkRequest request : workRequestList) {
            if (request.getId() == id) {
                return request;
            }
        }
        return null;
    }

    public void updateWorkRequestStatus(WorkRequest request, String newStatus) {
        request.setStatus(newStatus);
    }

    public List<WorkRequest> getStudentRequests() {
    return workRequestList.stream()
        .filter(req -> req.getRequester().getRole() instanceof StudentRole)
        .collect(Collectors.toList());
}

}
