package c322.asset.assetservices.model;


import jakarta.persistence.*;

@Entity
public class assets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Transient
    private String licenseId;
    @Transient
    private String licenseType;
    @Transient
    private String licenseDescription;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public String getLicenseDescription() {
        return licenseDescription;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public void setLicenseDescription(String licenseDescription) {
        this.licenseDescription = licenseDescription;
    }
}
