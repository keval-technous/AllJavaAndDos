package oop.concept.constructor;

public class Student {
    String sname;
    int sage;
    /**
     * Default Constructor
     */
    public Student()
    {
        System.out.println("Student class , Default constructor");
    }

    /**
     * Paramiterized constructor
     * @param sname
     */
    public Student(String sname){
        System.out.println("Student name:"+sname);
    }
    public Student(String sname,int sage)
    {
        System.out.println("student name:"+sname +" student age"+sage);
    }


    /**
     * Copy constructor
     */
    public Student(Student student)
    {
        this(student.sname,student.sage);
    }
}
