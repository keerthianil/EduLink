package Business.Enterprise;

import java.util.ArrayList;

public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    /**
     * Create and add a new enterprise to the directory.
     *
     * @param name The name of the enterprise.
     * @param type The type of the enterprise.
     * @return The created enterprise.
     */
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;

        if (type == Enterprise.EnterpriseType.EdTech) {
            enterprise = new EdTechEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.Corporate) {
            enterprise = new CorporateEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.NGO) {
            enterprise = new NGOEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.Logistics) {
            enterprise = new LogisticsEnterprise(name);
        }

        if (enterprise != null) {
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
