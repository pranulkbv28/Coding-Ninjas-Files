package ClassesAndobjects.EmployeeData;

public class Employee {
    String name;
        private int emp_id;
    public void set_id(int id)
    {
        if(id>0)
        emp_id=id;
        else 
        System.out.println("Invalid id");
    }
    public int get_id()
    {
        return emp_id;
    }
    public void set_name(String n)
    {
        name=n;
    }
}
