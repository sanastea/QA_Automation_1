package Second_Homework;

/**
 * Created by asadreev on 5/23/16.
 */
public class Library {
    private String name;
    private String address;

    public Library(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getLibraryname()
    {
        return name;
    }

    public String getLibraryAddress()
    {
        return address;
    }
}
