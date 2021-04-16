package simple;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the operation 1.addition 2.subtraction 3.multiplication 4.division 5.modulus");
		int application = scan.nextInt();
		System.out.println("enter the value of a =");
		int a = scan.nextInt();
		System.out.println("enter the value of a =");
		int b = scan.nextInt();
		switch (application) {
		
		case 1: System.out.println(a+b);
		break;
		case 2: System.out.println(a-b);
		break;
		case 3: System.out.println(a*b);
		break;
		case 4: System.out.println(a/b);
		break;
		case 5: System.out.println(a%b);
		break;
		default :
			System.out.println("IT IS NOT A OPTION");
			
		}
		
		

	}

}
