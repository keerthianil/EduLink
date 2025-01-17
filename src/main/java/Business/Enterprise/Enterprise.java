package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public Enterprise(String name, EnterpriseType type) {
        super(name, Organization.Type.Enterprise);
        this.enterpriseType = type;
        this.organizationDirectory = new OrganizationDirectory();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        EdTech("EdTech"),
        Corporate("Corporate"),
        NGO("NGO"),
        Logistics("Logistics");

        private final String value;

        EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public abstract void enterpriseOperations();
}
