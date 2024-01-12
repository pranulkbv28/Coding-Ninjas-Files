package ClassesAndobjects.StudentData;

import ClassesAndobjects.StudentData.StudentDetails.Student;

public class StudentUse2 {
    public static void main(String[] args) {
        Student stud = new Student("Pranaav", 20483, "28/02/2002");
        // System.out.println(stud.name);
        // this here throws an error
        // whereas
        System.out.println(stud.college); //will get printed
    }
}
