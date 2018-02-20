import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a method & Enter two numbers");
			String x= scan.nextLine();
			int num1 =scan.nextInt();
			int num2= scan.nextInt();
			
			System.out.println("Answer");
			
			
			if ( x.equals("Multiplication")){
				System.out.println(mult(num1,num2));
			}
			else if ( x.equals("Divison")) {
				System.out.println(divide(num1,num2));
			}
			else if ( x.equals("Addition")) {
				System.out.println(add(num1,num2));
			}
			else if ( x.equals("Substraction")) {
				System.out.println(subt(num1,num2));
			}	
			}
			
			public static double mult(int num1, int num2) {
				double sum4=num1* num2;
				return sum4;
			}
				public static int add(int num1, int num2) {
					int sum3=num1+ num2;
					return sum3;
				}
					public static int subt( int num1, int num2) {
						 int sum2= num1-num2;
						 return sum2;
					}
				public static double  divide( int num1, int num2) {
					 double sum1= num1/num2;
					 return sum1;
				}
				
				
		

	}


