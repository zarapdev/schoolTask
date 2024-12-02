import java.util.HashSet;

public class Classroom {
    private String name;
    private HashSet<Student> studentHashSet = new HashSet<>();

    public Classroom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Student> getStudentHashSet() {
        return studentHashSet;
    }

    public void setStudentHashSet(HashSet<Student> studentHashSet) {
        this.studentHashSet = studentHashSet;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "name='" + name + '\'' +
                ", studentHashSet=" + studentHashSet +
                '}';
    }
}
