package Business.WorkQueue;

import Business.UserAccount.UserAccount;

public class RecommendationRequest extends WorkRequest {

    private UserAccount recipient; // Corporate or individual receiving the recommendation
    private String recommendationText;

    public RecommendationRequest(String name, String description, UserAccount requester, UserAccount recipient) {
        super(name, "Recommendation Request", description, null, requester); // Type is "Recommendation Request"
        this.recipient = recipient;
    }

    public UserAccount getRecipient() {
        return recipient;
    }

    public void setRecipient(UserAccount recipient) {
        this.recipient = recipient;
    }

    public String getRecommendationText() {
        return recommendationText;
    }

    public void setRecommendationText(String recommendationText) {
        this.recommendationText = recommendationText;
    }

    @Override
    public String toString() {
        return "Recommendation Request for: " + getName() + ", Recipient: " + recipient.getUsername();
    }
}
