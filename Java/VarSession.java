class VarSession {
    public static void main(String [] args){
        // System.out.println(2+2);
        byte players = 11;  //byte range is from: -128 to +127 = 2^7 to (2^7 - 1)
        short score = 242; //short range is from: -32768 to +32767 = 2^15 to (2^15 - 1) 
        int seatings = 60000; //int range is from: -2,147,483,648 to +2,147,483,647 = 2^31 to (2^31 - 1)
        long collections = 123456789123456l; //long range is from: -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807 = 2^63 to (2^63 - 1)
    }
}
