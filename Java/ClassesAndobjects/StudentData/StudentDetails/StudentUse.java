package ClassesAndobjects.StudentData.StudentDetails;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("Pranaav", 20483, "28/02/2002"); 
        Student s2 = new Student("Vaisnavi", 20484, "03/08/2002");
        //s1 and s2 are refernces to the object that is being created.
        //both are separate memories of their respective objects where their addresses are stored.
        // basically, s1 and s2 hold the addresses to their respective objects.
        System.out.println(s1);
        System.out.println(s2);

        
        // s1.name="Pranaav B V";
        // s1.rollNumber=20483;

        // here, s1.dob would throw an error as it has the private access modifier
        // but if you want it to be printed
        System.out.println(s1.name+" "+s1.rollNumber+" "+s1.printDOB());
        //these are stored in the Heap Memory
        System.out.println();

        // s2.name="Vaisnavi";
        // s2.rollNumber=20484;
        // if you want a user defined value for a variable with a private access modifier
        // s2.setDOB("03/08/2002");
        // here, we first give the variable "dob" a new value and then we print it using the function printDOB()
        System.out.println(s2.name+" "+s2.rollNumber+" "+s2.printDOB());
        //these are stored in the Heap Memory
    }
}