package Business.Workshops;

import java.util.ArrayList;

import Business.EcoSystem;

public class WorkshopDirectory {
    private ArrayList<Workshop> workshopList;

    public WorkshopDirectory() {
        this.workshopList = new ArrayList<>();
    }

    // Method to add a new workshop
    public void addWorkshop(Workshop workshop) {
        // Add to local directory
        this.workshopList.add(workshop);

        // Add to global directory (but prevent infinite recursion)
        if (!EcoSystem.getInstance().getWorkshopDirectory().getWorkshopList().contains(workshop)) {
            EcoSystem.getInstance().getWorkshopDirectory().addWorkshop(workshop);
        }
    }

    // Method to get the list of all workshops
    public ArrayList<Workshop> getWorkshopList() {
        return workshopList;
    }

    // Method to find a workshop by name (or any other attribute if needed)
    public Workshop getWorkshopByName(String name) {
        for (Workshop workshop : workshopList) {
            if (workshop.getName().equals(name)) {
                return workshop;
            }
        }
        return null;
    }

    // Method to remove a workshop by name
    public void removeWorkshop(Workshop workshop) {
        workshopList.remove(workshop);
    }
    
    // Method to update a workshop's details
public void updateWorkshop(Workshop workshop, String newName, String newLocation, String newConductedBy, String newDescription) {
    // Updating the attributes of the selected workshop
    workshop.setName(newName);
    workshop.setLocation(newLocation);
    workshop.setConductedBy(newConductedBy);
    workshop.setDescription(newDescription);
}


    @Override
    public String toString() {
        return "Workshop Directory: " + workshopList.size() + " workshops available.";
    }
}
