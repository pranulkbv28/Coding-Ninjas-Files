class Typecasting {
    public static void main(String[] args) {
        // Typecasting is the method of changing the data type of a variable.
        // Two types
        // Implicit: It is done automatically by Java.
        // Explicit: It is done on user's authority.

        // Implicit
        byte age = 39;
        short currentYear = 2023;
        int birthYear = currentYear - age; //here, "birthYear" cannot be "short", even though the answer is within its range. 
        // This is an example of implicit typecasting.

        // Explicit
        short year = (short)(currentYear - age); //here, we have explicitly mentioned that our operation's value should have the data type of "short".
        
        System.out.println(birthYear+" "+year);
    }    
}
