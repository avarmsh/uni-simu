package Uni;
import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript = new HashMap<>();

    public Transcript(int studentID) {
        this.studentID = studentID;
    }

    public void setGrade(int presentedCourseID, double grade) {
        transcript.put(presentedCourseID, grade);
    }

    public void printTranscript() {
        System.out.println("Transcript for Student ID: " + studentID);
        for (Integer courseID : transcript.keySet()){
            System.out.println("Course ID: " + courseID + " - Grade: " + transcript.get(courseID));
        }
    }

    public double getGPA() {
        if (transcript.isEmpty()) return 0.0;
        double total = 0.0;
        for (double grade : transcript.values()){
            total += grade;
        }
        return total / transcript.size();
    }
}
