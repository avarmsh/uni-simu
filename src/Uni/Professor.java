package Uni;
import java.util.ArrayList;

public class Professor {
    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<>();
    public int personID;
    public int majorID;

    public Professor(int personID, int majorID) {
        this.id = professorList.size() + 1;
        this.personID = personID;
        this.majorID = majorID;
        professorList.add(this);
    }

    public static Professor findById(int id) {
        for (Professor p : professorList){
            if (p.id == id){
                return p;
            }
        }
        return null;
    }
}
