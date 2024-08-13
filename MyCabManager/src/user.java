import java.util.ArrayList;
import java.util.List;

public class user extends Person {
    public List<rides> rides = new ArrayList<>();
    public int destX;
    public int destY;
    user(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
