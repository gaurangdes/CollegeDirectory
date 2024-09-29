public class Faculty extends User {
    private String name;
    private String officeHours;
    private String contactEmail;
    private String contactPhone;
    private List<Course> courses;

    // Constructors
    public Faculty() {}

    public Faculty(int id, String username, String password, String role, String name, String officeHours, String contactEmail, String contactPhone) {
        super(id, username, password, role);
        this.name = name;
        this.officeHours = officeHours;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.courses = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
