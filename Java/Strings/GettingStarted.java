package Strings;

class GettingStarted {
    public static void main(String[] args) {
        // Declaring/Initialising Strins

        // Assigning String Literals
        String s1 = "Welcome";

        // Using "new" keywords
        // 1. Passing String Literal
        String str = new String("to");

        // 2. Passing Character Array
        char ch[] = {'c', 'o', 'd', 'i', 'n', 'g'};
        String str2 = new String(ch);

        // 3. Passing Byte Array
        byte b[] = {97, 98, 99, 100};
        String str3 = new String(b);


        System.out.println(s1);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }    
}
