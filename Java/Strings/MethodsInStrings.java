package Strings;

class MethodsInStrings {
    public static void main(String[] args) {
        String str = "  Coding Is Good. ";

        // Methods in String
        // 1. length
        int lengthOfString = str.length();
        System.out.println("The length of the String is: "+lengthOfString);

        // 2. toLowerCase()
        String lowerCaseStr = str.toLowerCase();
        System.out.println("The String in lower case is: "+lowerCaseStr);

        // 3. toUpperCase()
        String upperCaseStr = str.toUpperCase();
        System.out.println("The String in upper case is: "+upperCaseStr);

        // 4. charAt(), this gives us the individual position
        char individualChar = str.charAt(3);
        System.out.println("The value at 3rd index is: "+individualChar);

        // 5. trim(), this removes the spaces before and after the String
        String trimmedStr = str.trim();
        System.out.println("The String after getting trimmed is: "+trimmedStr);

        // 6. substring(), is used to to get parts os a String.
        // If only the begining index is given, then the new String will start from that index and moves on until the last
        // The end index is exclusive, not inclusive, of the value at that index
        String partOfStr = str.substring(6, 10);
        System.out.println("The String where the beginIndex is 6 and the endIndex is 10 is: "+partOfStr);

        // 7. replace(), it replaces the older values to newer values
        String replacedString = str.replace("o", "@");
        System.out.println("The SString when all the 'o' are replaced with '@': "+replacedString);

        // 8. indexOf(), this gives us the 1st index of the inputted char from the starting of the String
        int firstindex = str.indexOf('o');
        System.out.println("The first index of 'o' is: "+firstindex);

        // 9. lastIndexOf(), this gives us the 1st index of the inputted char from the ending of thr String
        int lastIndex = str.lastIndexOf('o');
        System.out.println("The last index of 'o' is: "+lastIndex);

        // 10. equals(), this method is used to check if two Strings are equal or not. The order does not matter
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";
        System.out.println("Is 's1' equal to 's2': "+s1.equals(s2));
        System.out.println("Is 's2' equal to 's3': "+s2.equals(s3));
        System.out.println("Is 's3' equal to 's1': "+s3.equals(s1));

        // 11. compareTo(), this method compares the two given Strings
        // As in, it takes the difference between the ASCII values of the individual characters of the String
        // If the answer = 0, both Strings are equal
        // If the answer>0, the 1st String is greater than the 2nd
        // If the answer<0, the 1st String is lesser than the 2nd
        System.out.println("Comparison between 's1' and 's2': "+s1.compareTo(s2));
        System.out.println("Comparison between 's2' and 's3': "+s2.compareTo(s3));
        System.out.println("Comparison between 's3' and 's1': "+s3.compareTo(s1));
    }    
}
