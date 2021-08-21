import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//ReverseNumber RN = new ReverseNumber(); for creating objectes
		//RN.Reverse(num);
		Reverse(num);
	}
	static void Reverse(int num){
		int temp=num;
		int rem=0, sum=0;
		while(num > 0) {
			rem=num%10;
			num=num/10;
			sum =sum*10 +rem;
		}
		System.out.println(temp);
		System.out.println(sum);
	}
}
