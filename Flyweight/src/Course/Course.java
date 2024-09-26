package Course;

public class Course implements ICourse {
    private final String courseName;
    private final String professor;
    private final String schedule;

    public Course(String courseName, String professor, String schedule) {
        this.courseName = courseName;
        this.professor = professor;
        this.schedule = schedule;
    }

    @Override
    public void enroll(String studentId) {
        System.out.println("Student " + studentId + " enrolled in " + courseName +
                " taught by " + professor + " on " + schedule);
    }
}
