package Second_Homework;

import Second_Homework.Institute;

/**
 * Created by asadreev on 5/23/16.
 */
public class SecondClass {

    public static void main(String args[]) {
        Institute myInstitute = new Institute();
        myInstitute.addStudent("John", "Peterson", 25, "Geology", 2);
        myInstitute.addStudent("Jenny", "Peterson", 27, "Biology", 4);
        myInstitute.showStudent(0);
        myInstitute.showStudent(1);
        myInstitute.addLibrary("Favourite Library", "Street of Dreams 60");
        myInstitute.showLibrary(0);
        myInstitute.addCampus(12);
        myInstitute.showCampus(0);

    }
}
