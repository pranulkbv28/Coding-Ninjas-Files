import java.util.Scanner;

class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();

		if((X+Y>Z)&&(X+Z>Y)&&(Y+Z>X)){
			if((X==Y)&&(Y==Z)&&(X==Z)){
				System.out.println("Equilateral Triangle");
			}
			else if((X==Y)||(Y==Z)||(X==Z)){
				System.out.println("Isosceles Triangle");
			}
			else{
				System.out.println("Scalene Triangle");
			}
		}
		else{
			System.out.println("Not a Triangle");
		}

        sc.close();
    }    
}
