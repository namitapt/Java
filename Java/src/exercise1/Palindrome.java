package exercise1;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome or not:");
		int n = sc.nextInt();
		int rem, rev=0, temp;
		//int n = 12321;
		temp=n;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println(temp+" is a Palindrome");
		}
		else {
			System.out.println(temp+" is not a Palindrome");
		}
		sc.close();
	}

}
