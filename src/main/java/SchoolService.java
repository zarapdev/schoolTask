public interface SchoolService {
    void addClass(Classroom className);
    void addStudent(String className, Integer id, String name);
    Classroom getClassStudents(String name);

}

