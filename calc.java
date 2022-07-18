package arithmetic_calculator;
import java.util.Scanner;
public class calc {
	public static void main (String[] args) {
		double a;
		double b;
		double result;
		char operator;
		Scanner cl= new Scanner(System.in);
		System.out.println("Enter first number");
		a= cl.nextDouble();
		System.out.println("Enter second number ");
		b=cl.nextDouble();
		System.out.println("Enter the operation to be done ( +, -, *, /)");
		operator=cl.next().charAt(0);
		switch(operator) {
		case'+':
			result= a+b;
			System.out.println(a+"+"+b+"="+result);
			break;
		case'-':
			result=a-b;
			System.out.println(a+"-"+b+"="+result);
			break;
		case'*':
			result=a*b;
			System.out.println(a+"*"+b+"="+result);
			break;
		case'/':
			result=a/b;
			System.out.println(a+"/"+b+"="+result);
			break;
			default:
				System.out.println("Invalid operator");
			
		}
	}

}
