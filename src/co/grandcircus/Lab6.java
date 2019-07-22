package co.grandcircus;

import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to GR Casino, ready to shoot some Dice! Come Try your luck!");
		System.out.println("Enter the number of sides a dice has.");
		int num = scan.nextInt();
		
		int die1;
		int die2;
		int i = 1;
		
		while (num != 0) {
			if (num > 0) {
		
		die1 = (int)(Math.random()*6) + 1;
		die2 = (int)(Math.random()*6) + 1;
		
		System.out.println(" ");
		System.out.println("Roll " + i++);
		System.out.println("The first die comes up " + die1);
	
		System.out.println("The second die comes up " + die2);
		System.out.println(" ");
		
			}
		System.out.println("Would like to continue, Press 0 for no, press any number between 1 - 10 for yes!");
			num = scan.nextInt();
		}	
			
		System.out.println("Thanks for playing!");
		
	}
}
