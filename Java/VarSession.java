class VarSession {
    public static void main(String [] args){
        // Primitive Data types.
        byte players = 11;  //it's storage is 1 byte    //byte range is from: -128 to +127 = 2^7 to (2^7 - 1)
        short score = 242; //it's storage is 2 byte    //short range is from: -32768 to +32767 = 2^15 to (2^15 - 1) 
        int seatings = 60000; //it's storage is 4 byte    //int range is from: -2,147,483,648 to +2,147,483,647 = 2^31 to (2^31 - 1)
        long collections = 123456789123456l; //it's storage is 8 byte    //long range is from: -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807 = 2^63 to (2^63 - 1)
        float avg = 98.3f; //it's storage is 4 byte //upto 6 decimal places
        
        // by default, Java assigns a decimal number to "double", to make sure we need only "float", we have to add an "f" after the value.

        double unit = 4.85858696874; //it's storage is 8 byte. //upto 16 decimal places.

        char ch = 'a'; //it's storage is 2 byte //it should be enclosed in ''. //we can also use UniCodes, https://home.unicode.org/

        // to represent in binary
        byte x = 0b1111; //before the binary notation, we need add "0b" //this is binary for 15. //(1111), in binary = 15
        
        //to represent in octal
        short y = 013; //before the octal notation, we need to add "0" //this is octal for 11. //(13), in octal = 11

        //to represnt in hexadecimal
        int z = 0xA; //before the hexa notation, we need to add "0x" //this is hexa for 10. //(A), in hexa = 10

        String myName = "Pranaav B V";

        System.out.println(myName);
        System.out.println(z);

    
    
    
    }
}
