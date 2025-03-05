package Uni;
import java.util.ArrayList;

public class Student {
    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personID;
    public final int entranceYear;
    public int majorID;
    public String studentID;

    public Student(int personID, int entranceYear, int majorID) {
        this.id = studentList.size() + 1;
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;
        setStudentCode();
        studentList.add(this);
    }

    public static Student findById(int id) {
        for (Student s : studentList){
            if (s.id == id){
                return s;
            }
        }
        return null;
    }

    public void setStudentCode() {
        Major major = Major.findById(this.majorID);
        if (major != null){
            this.studentID = this.entranceYear + "0" + this.id;
        }
    }
}
