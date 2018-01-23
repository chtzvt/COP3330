/*
	Charlton Trezevant
	COP 3330 - 2018
	Assignment 1 - Even/Odd Number Detection Program
*/

import java.util.Scanner;

public class EvenOdd {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.print("Input an integer: ");
		int value = in.nextInt();

		System.out.printf("%d is an %s number.%n", value, (value % 2 == 0) ? "even" : "odd");
	}
}
