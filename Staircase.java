// This program calculates total cubic centimeters needed for staircase 
// through user inputs of steps, width, rise, and run. 
// It calcuates the total number of steps needed through the formula 𝑠𝑢𝑚=𝑛(𝑛+1)2 and
// the cubic centimeters needed for one block. It takes the product of the two then rounds the
// final values to the nearest integer. 

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args){
		String input;
		double steps;
		double width;
		double rise;
		double run;
		double total;
		double sum;
		double volume;
		int volumeRounded;
		
		Scanner terminal = new Scanner(System.in);
		System.out.println("Staircase Volume Calculator");
		System.out.println("How many steps in the staircase?");
		while (!terminal.hasNextDouble()) {
			input = terminal.next();
			System.out.printf("\"%s\" is not a valid number.\n", input);
			System.out.println("Please enter a valid number:");
		}
		steps = terminal.nextDouble();
		sum = steps * (steps+1) * 0.5;
		
		System.out.println("Enter step width in cm:");
		while (!terminal.hasNextDouble()) {
			input = terminal.next();
			System.out.printf("\"%s\" is not a valid number.\n", input);
			System.out.println("Please enter a valid number:");
		}
		width = terminal.nextDouble();
		
		System.out.println("Enter rise of the step in cm:");
		while (!terminal.hasNextDouble()) {
			input = terminal.next();
			System.out.printf("\"%s\" is not a valid number.\n", input);
			System.out.println("Please enter a valid number:");
		}
		rise = terminal.nextDouble();
		
		System.out.println("Enter run of the step in cm:");
		while (!terminal.hasNextDouble()) {
			input = terminal.next();
			System.out.printf("\"%s\" is not a valid number.\n", input);
			System.out.println("Please enter a valid number:");
		}
		run = terminal.nextDouble();
		volume = sum * width * rise * run;
		volumeRounded = (int) (volume + 0.5);
		
		System.out.println("Total volume is " + volumeRounded + " cubic centimeters.");
		
	}
}
