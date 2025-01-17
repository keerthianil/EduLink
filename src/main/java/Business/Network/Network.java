package Business.Network;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;

public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Network(String name) {
        this.name = name;
        this.enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getName() {
        return name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    /**
     * Add an enterprise to the network's enterprise directory.
     *
     * @param enterprise The enterprise to add.
     */
    public void addEnterprise(Enterprise enterprise) {
        enterpriseDirectory.getEnterpriseList().add(enterprise);
    }
}
