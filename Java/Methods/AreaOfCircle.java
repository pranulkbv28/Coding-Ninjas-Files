package Methods;

import java.util.Scanner;

class AreaOfCircle {
    public static double calculateCircleArea(double radius){
        float area = (float) (2*3.14*radius);
        return area;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area1 = calculateCircleArea(radius);
        System.out.println(area1);
        sc.close();
    }
}
