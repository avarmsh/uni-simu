package Base;
import java.util.ArrayList;

public class Person {
    public int id;
    public static ArrayList<Person> personList = new ArrayList<>();
    public String name;
    public String nationalID;

    public Person(String name, String nationalID){
        this.id = personList.size() + 1;
        this.name = name;
        this.nationalID = nationalID;
        personList.add(this);
    }

    public static Person findByID(int id){
        for (Person p : personList) {
            if (p.id == id){
                return p;
            }
        }
        return null;
    }
}
