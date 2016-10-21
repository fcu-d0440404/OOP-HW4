package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		
		NissanTiida number = new NissanTiida();
		Scanner scanner = new Scanner(System.in);
		int loop,i=1;
		System.out.println("Please enter a number: ");
		loop= scanner.nextInt();

		for(i=1;i<(loop+1);i++){
		
			number.tiida();
		}
		
		scanner.close();
	}
	

}