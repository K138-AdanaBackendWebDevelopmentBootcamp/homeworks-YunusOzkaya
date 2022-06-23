import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {
    //Each course has a course name, a course code, and a credit score
    private String cName;
    private String cCode;
    private long cScore;
    private Instructor instructor;
    private List<Student> studentList = new ArrayList<>();


    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public long getcScore() {
        return cScore;
    }

    public void setcScore(long cScore) {
        this.cScore = cScore;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Course(String cName, String cCode, long cScore) {
        this.cName = cName;
        this.cCode = cCode;
        this.cScore = cScore;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return cCode.equals(course.cCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cCode);
    }
    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                ", cCode='" + cCode + '\'' +
                ", cScore=" + cScore +
                ", instructor=" + instructor +
                '}';
    }
}
