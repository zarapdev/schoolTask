import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Classroom > classRoomList = new ArrayList<>();

    public List<Classroom> getClassRoomList() {
        return classRoomList;
    }

    public void setClassRoomList(List<Classroom> classRoomList) {
        this.classRoomList = classRoomList;
    }
}
