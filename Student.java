public class Student extends User {
    private String name;
    private String photo;
    private String contactDetails;
    private List<Course> courses;
    private Map<Course, String> grades; // Course and corresponding grade
    private Map<Course, Integer> attendance; // Course and attendance percentage

    // Constructors
    public Student() {}

    public Student(int id, String username, String password, String role, String name, String photo, String contactDetails) {
        super(id, username, password, role);
        this.name = name;
        this.photo = photo;
        this.contactDetails = contactDetails;
        this.courses = new ArrayList<>();
        this.grades = new HashMap<>();
        this.attendance = new HashMap<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Map<Course, String> getGrades() {
        return grades;
    }

    public void setGrades(Map<Course, String> grades) {
        this.grades = grades;
    }

    public Map<Course, Integer> getAttendance() {
        return attendance;
    }

    public void setAttendance(Map<Course, Integer> attendance) {
        this.attendance = attendance;
    }
}
