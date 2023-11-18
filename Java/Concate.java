class Concate {
    public static void main(String[] args) {
        // "+" operator is used to concate two or more strings and make it into another complete string

        String firstName = "Pranaav";
        String lastName = "BV";

        String fullName = firstName+" "+lastName;

        System.out.println(fullName);



        char ch = 'a';
        char ch2 = 'b';

        System.out.println(ch + ch2); // the result would be 195, as ASCII of a = 97 and b = 98, and 97+98 = 195.
        System.out.println(ch+1); // the result would be 98.

        char newChar = (char)(ch+1);

        System.out.println(newChar); // the result would be b, as we are explicityly typecasting the value to have a datatype as char.
    }    
}
