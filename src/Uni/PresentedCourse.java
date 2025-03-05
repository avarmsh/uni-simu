package Uni;
import java.util.ArrayList;

public class PresentedCourse {
    public int id;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();
    public int courseID;
    public int professorID;
    public int capacity;
    public ArrayList<Integer> studentIds = new ArrayList<>();

    public PresentedCourse(int courseID, int professorID, int capacity) {
        this.id = presentedCourseList.size() + 1;
        this.courseID = courseID;
        this.professorID = professorID;
        this.capacity = capacity;
        presentedCourseList.add(this);
    }

    public static PresentedCourse findById(int id) {
        for (PresentedCourse pc : presentedCourseList){
            if (pc.id == id){
                return pc;
            }
        }
        return null;
    }

    public void addStudent(int studentID) {
        if (studentIds.size() < capacity){
            studentIds.add(studentID);
        }
        else{
            System.out.println("Uni.Course is full!");
        }
    }
}
