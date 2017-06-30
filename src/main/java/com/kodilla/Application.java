package com.kodilla;

import java.util.*;

class Calculator
{
	private static final int NUMBERS_UPPER_BOND_EXCLUSIVE = 11;

	private static int generateRandomNumber() {
		Random randomize = new Random();
		int number = randomize.nextInt(NUMBERS_UPPER_BOND_EXCLUSIVE);
		return number;
	}

	private static void addition() {
		int a = generateRandomNumber();
		int b = generateRandomNumber();
		int sum = a + b;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}

	private static void subtraction() {
		int b = generateRandomNumber();
		int a = generateRandomNumber();
		int con = b - a;
		System.out.println("B minus A: " + b + "-" + a + " = " + con);
	}

	public static void main (String[] args) {
		Calculator execute = new Calculator();
		execute.addition();
		execute.subtraction();
	}
}
