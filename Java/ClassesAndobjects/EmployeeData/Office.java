package ClassesAndobjects.EmployeeData;

public class Office {
    public static void main (String[] args) {
        Employee e=new Employee();  
        e.set_id(10);
        e.set_name("Naman");
        System.out.println(e.get_id()+" "+e.name);
    }
}
