package Methods;

class MethodsWithArguments {
    public static void printDetails(String name, String dob, long acc){
        System.out.println("Name: "+name);
        System.out.println("Date of Birth: "+dob);
        System.out.println("Account Number: "+acc);
    }
    
    public static void main(String[] args) {
        printDetails("Pranaav", "28/02/2002", 2823473475623423l);
        printDetails("Vaisnavi", "03/08/2002", 2783462378462378234l);
    }
}
