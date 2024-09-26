import Course.CourseFactory;
import Course.ICourse;

/// Bài toán: Việc tổ chức các lớp học hiện nay rất phức tạp với nhiều trường thông tin khác nhau cùng với nhiều đối
/// tượng khác nhau như Lớp học, môn học, khóa học, học sinh,... Hãy thiết kế hệ thống môn học có chức năng ghi danh
/// học sinh với các trường thông tin đơn giản. Đơn giản hóa việc ghi danh bằng dòng thông báo.
public class Main {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();

        enrollStudent(factory, "S001", "Computer Science 101", "Dr. Smith", "Mon/Wed 10:00 AM");
        enrollStudent(factory, "S002", "Computer Science 101", "Dr. Smith", "Mon/Wed 10:00 AM");
        enrollStudent(factory, "S003", "Mathematics 201", "Dr. Johnson", "Tue/Thu 2:00 PM");
        enrollStudent(factory, "S001", "Mathematics 201", "Dr. Johnson", "Tue/Thu 2:00 PM");
        enrollStudent(factory, "S004", "Computer Science 101", "Dr. Smith", "Mon/Wed 10:00 AM");
    }

    private static void enrollStudent(CourseFactory factory, String studentId,
                                      String courseName, String professor, String schedule) {
        ICourse course = factory.getCourse(courseName, professor, schedule);
        course.enroll(studentId);
    }
}