package Business.WorkQueue;

import java.util.List;
import java.util.ArrayList;

import Business.UserAccount.UserAccount;

public class FundRequest extends WorkRequest {

    private double price;
    private double amountFunded;
    private UserAccount donor;

    public FundRequest(String name, String description, String location, UserAccount requester, double price) {
        super(name, "Fund Request", description, location, requester);
        this.price = price;
    } 
    
    public double getPrice() {
        return price;
    }

    public double getAmountFunded() {
        return amountFunded;
    }

    public void setAmountFunded(double amountFunded) {
        this.amountFunded = amountFunded;
    }

    public UserAccount getDonor() {

        return donor;

    }

    public void setDonor(UserAccount donor) {
        this.donor = donor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   // getFundRequestList craete a list of fund requests















    @Override
    public String toString() {
        return "Request ID: " + getId() + ", Name: " + getName() + ", Type: " + getType() + ", Status: " + getStatus();
    }
}
