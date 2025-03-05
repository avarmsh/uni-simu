package Uni;
import java.util.ArrayList;

public class Major {
    public int id;
    public static ArrayList<Major> majorList = new ArrayList<>();
    public String name;
    public final int capacity;
    public int numberOfStudents = 0;

    public Major(String name, int capacity){
        this.id = majorList.size() + 1;
        this.name = name;
        this.capacity = capacity;
        majorList.add(this);
    }

    public static Major findById(int id){
        for(Major m : majorList){
            if(m.id == id){
                return m;
            }
        }
        return null;
    }

    public void addStudent(){
        if(numberOfStudents < capacity){
            numberOfStudents++;
        }
        else{
            System.out.println("Class is full!");
        }
    }
}
