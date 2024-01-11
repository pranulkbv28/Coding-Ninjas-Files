package ClassesAndobjects.StudentDetails;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        Student s2 = new Student();
        //s1 and s2 are refernces to the object that is being created.
        //both are separate memories of their respective objects where their addresses are stored.
        // basically, s1 and s2 hold the addresses to their respective objects.
        System.out.println(s1);
        System.out.println(s2);

        
        s1.name="Pranaav B V";
        s1.rollNumber=20483;

        // here, s1.dob would throw an error as it has the private access modifier
        System.out.println(s1.name+" "+s1.rollNumber);
        //these are stored in the Heap Memory
        System.out.println();

        s2.name="Vaisnavi";
        s2.rollNumber=20484;
        System.out.println(s2.name+" "+s2.rollNumber);
        //these are stored in the Heap Memory
    }
}
