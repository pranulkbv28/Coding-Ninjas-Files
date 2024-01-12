package ClassesAndobjects.StudentData.StudentDetails;

public class Student {
    String name="Pranaav";
    int rollNumber=483;
    // these two have defalut modifiers and thus can be accessed in the same package
    public String college="Vellore Institue of Technology";
    // if the variable has a public access modifier, it can be accessed even outside the package
    private String dob="28/02/2002";

    
    public Student(String n, int num, String dob){
        name=n;
        rollNumber=num;
        this.dob=dob;
    }


    public void setDOB(String dateOfBirth){
        dob = dateOfBirth;
        // System.out.println(dob);
    }
    public String printDOB(){
        return dob;
    }
    public static void main(String[] args) {
        // Student student = new Student();
        // System.out.println(student.dob);
        // student.printDOB();
        // this works because the method is created inside the Student class
        // we can also use a direct method.
    }
}
class Test{
    public static void main(String[] args) {
        Student s3 = new Student("Pranaav", 20483, "28/02/2002");
        Student s4 = new Student("Vaisnavi", 20484, "03/08/2002");
        System.out.println(s3.name+" "+s3.rollNumber);
        System.out.println(s4.name+" "+s4.rollNumber);
        // System.out.println(s3);
        // System.out.println(s4);
    }
}

// codes where the classes are made into the same file are not usually followed as it is not that clean compared to the 2nd method