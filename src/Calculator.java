import java.util.Scanner;

public class Calculator {

	int add(int a,int b) 
	{
		int sum=a+b;
		return sum;
	}
	int subtract(int a,int b) 
	{
		int diff=a-b;
		return diff;
	}
	int multiply(int a,int b) 
	{
		int result=a*b;
		return result;
	}
	int division(int a,int b) 
	{
		int result=a/b;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Calculator");
			System.out.println("====================");
			System.out.println("Enter 1 to add");
			System.out.println("Enter 2 to Subtract");
			System.out.println("Enter 3 to Multiply");
			System.out.println("Enter 4 to Divide");
			System.out.println("Enter 5 to Exit application");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:{
				//addition
				System.out.println("Enter 1st number");
				int a=sc.nextInt();
				System.out.println("Enter 2nd number");
				int b=sc.nextInt();
				System.out.println("Sum = "+obj.add(a, b));
				break;
			}
			case 2:{
				//Subtraction
				System.out.println("Enter 1st number");
				int a=sc.nextInt();
				System.out.println("Enter 2nd number");
				int b=sc.nextInt();
				System.out.println("Difference = "+obj.subtract(a, b));
				break;
			}
			case 3:{
				//Multiplication
				System.out.println("Enter 1st number");
				int a=sc.nextInt();
				System.out.println("Enter 2nd number");
				int b=sc.nextInt();
				System.out.println("Result of multiplication = "+obj.multiply(a, b));
				break;
			}
			case 4:{
				//Division
				System.out.println("Enter 1st number");
				int a=sc.nextInt();
				System.out.println("Enter 2nd number");
				int b=sc.nextInt();
				System.out.println("Result of division = "+obj.division(a, b));
				break;
			}
			case 5:{
				//To exit the app
				System.out.println("Exiting the application");
				return;
			}
			default:{
				break;
			}
			}
		}while(true);
	}

}
