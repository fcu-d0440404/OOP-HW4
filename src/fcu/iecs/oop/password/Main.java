package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		
	String a;
	String b="exit";
	PasswordEncorder password = new PasswordEncorder();
	Scanner scanner = new Scanner(System.in);

	do
	{
		System.out.println("Please enter a password: ");
		a= scanner.next();
		
		System.out.printf(password.encode(a));
	}while(a!=b);
		
	
	
	}

}
