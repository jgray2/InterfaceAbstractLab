package lab1;

/**
 * This class must specify prerequisites for the class. It inherits the
 * courseName, courseNumber & credits methods/properties from the super class
 * ProgrammingCourse.
 *
 * @Jenni Burgmeier
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
}
