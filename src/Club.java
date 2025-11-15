
import java.util.ArrayList;

public class Club {
    private String name;
    private ArrayList<Student> members;

    public Club(String name) {
        this.name = name;
        this.members = new ArrayList<Student>();
    }

    public void addMember(Student student) {
        if (!members.contains(student)) {
            members.add(student);
        }
    }

    public ArrayList<Student> getMembers() { return members; }
    public String getName() { return name; }
}
