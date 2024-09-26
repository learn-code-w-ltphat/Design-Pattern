package Course;

import java.util.HashMap;
import java.util.Map;

public class CourseFactory {
    private final Map<String, Course> courses = new HashMap<>();

    public Course getCourse(String courseName, String professor, String schedule) {
        String key = courseName + "-" + professor + "-" + schedule;
        if (!courses.containsKey(key)) {
            courses.put(key, new Course(courseName, professor, schedule));
        }
        return courses.get(key);
    }
}
