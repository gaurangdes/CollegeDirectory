public class Administrator extends User {
    private String name;
    private String contactEmail;
    private String contactPhone;

    // Constructors
    public Administrator() {}

    public Administrator(int id, String username, String password, String role, String name, String contactEmail, String contactPhone) {
        super(id, username, password, role);
        this.name = name;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
