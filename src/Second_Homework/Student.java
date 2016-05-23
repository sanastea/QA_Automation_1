package Second_Homework;

import Second_Homework.Human;

/**
 * Created by asadreev on 5/23/16.
 */
public class Student extends Human {
      public String specialization;
      public int year;


    public Student (String name, String surname, int age, String specialization, int year) {
        super(name, surname, age);
        this.specialization = specialization;
        this.year = year;

    }

    public String getStudentFullName()
    {
        return this.getHumanName() + " " + this.getHumanSurname();
    }

    public int getStudentAge(){
        return this.getHumanAge();
    }

    public int getStudentYear()
    {
        return year;
    }

    public String getStudentSpecialization(){
        return specialization;
    }
}

