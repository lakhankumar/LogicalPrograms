import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int num3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int num1 = scan.nextInt();
		System.out.println("Enter Second number");
		int num2 = scan.nextInt();
		System.out.println("Enter Count value");
		int count =  scan.nextInt();
		System.out.print(num1+ " "+num2);
		for (int i = 2; i < count; i++) {
			num3 = num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
	}

}
