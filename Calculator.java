import java.util.Scanner;

public class Calculator{
	public static void main(String[] args) {

		
		double a, b;
		double result;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("==============================================");
			System.out.println("1. ADDITION");
			System.out.println("2. SUBTRACTION");
			System.out.println("3. MULTIPLICATION");
			System.out.println("4. DIVISION");
			
			System.out.println("==============================================");

			
			System.out.print("Enter your first number:\n");
			a = sc.nextDouble();
			
			System.out.print("Enter your second number:\n");
			b = sc.nextDouble();

			System.out.print("Enter your choice ");
			
			int operator = sc.nextInt();

			switch (operator) {
			case 1:
				result=a+b;
               System.out.println(a + " + " + b + " = " + result);
				break;

			case 2:
            result=a-b;
            System.out.println(a + " - " + b + " = " + result);
				break;

			case 3:
            result=a*b;
            System.out.println(a + " * " + b + " = " + result);
				break;

			case 4:
            result=a/b;
            System.out.println(a + " / " + b + " = " + result);
				break;

			

			case 0:
				System.exit(0);

			default:
				System.out.printf("Please enter specified operator only");
				return;
			}
			
		} while (result != 0);
		sc.close();
	}
}
