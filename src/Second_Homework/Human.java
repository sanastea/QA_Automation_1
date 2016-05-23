package Second_Homework;

/**
 * Created by asadreev on 5/23/16.
 */
public class Human {
    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getHumanName(){
        return name;
    }

    public String getHumanSurname(){
        return surname;
    }

    public int getHumanAge(){
        return age;
    }

}
