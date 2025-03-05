import Base.Person;
import Uni.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ava", "40313403");
        Person p2 = new Person("Parimah", "40313404");
        Person p3 = new Person("Mrs.Zare", "12345");
        Person p4 = new Person("Mr.Ghatee", "123456");
        Person p5 = new Person("Noora", "40312400");

        Major cs = new Major("Computer Science", 15);
        Major math = new Major("Mathematics", 10);

        Student s1 = new Student(p1.id, 2023, cs.id);
        Student s2 = new Student(p2.id, 2023, cs.id);
        Student s3 = new Student(p5.id, 2023, math.id);

        System.out.println("Student 1 ID: " + s1.studentID);
        System.out.println("Student 2 ID: " + s2.studentID);
        System.out.println("Student 3 ID: " + s3.studentID);

        Professor prof1 = new Professor(p2.id, cs.id);
        Professor prof2 = new Professor(p3.id, math.id);

        System.out.println("Professor 1 ID: " + prof1.id);
        System.out.println("Professor 2 ID: " + prof2.id);

        Course course1 = new Course("Bp", 3);
        Course course2 = new Course("Ap", 4);
        Course course3 = new Course("Ai", 3);

        PresentedCourse presented1 = new PresentedCourse(course1.id, prof1.id, 20);
        PresentedCourse presented2 = new PresentedCourse(course2.id, prof1.id, 15);
        PresentedCourse presented3 = new PresentedCourse(course3.id, prof2.id, 10);

        presented1.addStudent(s1.id);
        presented1.addStudent(s2.id);
        presented2.addStudent(s1.id);
        presented2.addStudent(s2.id);
        presented2.addStudent(s3.id);
        presented3.addStudent(s3.id);

        Transcript t1 = new Transcript(s1.id);
        Transcript t2 = new Transcript(s2.id);
        Transcript t3 = new Transcript(s3.id);

        t1.setGrade(presented1.id, 19.0);
        t1.setGrade(presented2.id, 18.0);
        t2.setGrade(presented1.id, 17.5);
        t2.setGrade(presented2.id, 19.5);
        t3.setGrade(presented2.id, 16.0);
        t3.setGrade(presented3.id, 20.0);

        t1.printTranscript();
        System.out.println("GPA: " + t1.getGPA());

        t2.printTranscript();
        System.out.println("GPA: " + t2.getGPA());

        t3.printTranscript();
        System.out.println("GPA: " + t3.getGPA());
    }
}

