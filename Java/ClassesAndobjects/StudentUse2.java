package ClassesAndobjects;

import ClassesAndobjects.StudentDetails.Student;

public class StudentUse2 {
    public static void main(String[] args) {
        Student stud = new Student();
        // System.out.println(stud.name);
        // this here throws an error
        // whereas
        System.out.println(stud.college); //will get printed
    }
}
