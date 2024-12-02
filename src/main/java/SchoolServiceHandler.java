public class SchoolServiceHandler implements SchoolService {

    School school = new School();


    @Override
    public void addClass(Classroom className) {
        school.getClassRoomList().add(className);

    }

    @Override
    public void addStudent(String className, Integer id, String name) {
        for (Classroom classroom : school.getClassRoomList()) {

            if (classroom.getName().equalsIgnoreCase(className)) {
                classroom.getStudentHashSet().add(new Student(id, name));
            }


        }

    }

    @Override
    public Classroom getClassStudents(String name) {
        for (Classroom classroom : school.getClassRoomList()) {

            if (classroom.getName().equalsIgnoreCase(name)) {
                return classroom;

            }

        }
        return null;
    }
}