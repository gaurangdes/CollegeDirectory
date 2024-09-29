public class Course {
    private int courseId;
    private String courseName;
    private String department;

    // Constructors
    public Course() {}

    public Course(int courseId, String courseName, String department) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.department = department;
    }

    // Getters and Setters
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
