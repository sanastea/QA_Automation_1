package Second_Homework;

import Second_Homework.Campus;
import test_app.Library;
import test_app.Student;

import java.util.ArrayList;

/**
 * Created by asadreev on 5/23/16.
 */
public class Institute {
    ArrayList<Student> students;
    ArrayList<Library> libraries;
    ArrayList<Campus> campuses;

    public Institute() {
        this.students = new ArrayList<Student>();
        this.libraries = new ArrayList<Library>();
        this.campuses = new ArrayList<Campus>();
    }

    public void addStudent(String name, String surname, int age, String specialization, int year) {
        Student student = new Student(name, surname, age, specialization, year);
        students.add(0, student);
    }

    public void showStudent(int index) {
        Student theStudent = students.get(index);
        System.out.println(theStudent.getStudentFullName());
        System.out.println(theStudent.getStudentAge());
        System.out.println(theStudent.getStudentSpecialization());
        System.out.println(theStudent.getStudentYear());
    }


    public void addLibrary(String name, String address){
        libraries.add(0,new Library(name,address));
    }

    public void showLibrary(int index){
        Library theLibrary = libraries.get(index);
        System.out.println(theLibrary.getLibraryname());
        System.out.println(theLibrary.getLibraryAddress());

    }

    public void addCampus(int campusId)
    {
        campuses.add(0,new Campus(campusId));
    }

    public void showCampus(int index){
        Campus theCampus= campuses.get(index);
        System.out.println(theCampus.getCampusId());
    }

}
