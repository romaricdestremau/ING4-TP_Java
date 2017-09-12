package Exo_3;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("saisissez deux entiers");
		

		 Scanner scanner,scanner2;
		 scanner = new Scanner(System.in);
		 scanner2 = new Scanner(System.in);
		 int value = scanner.nextInt();
		 int value2 = scanner2.nextInt();
		 // completer ici
		 
		 int dif = value-value2;
		 int prod = value * value2;
		 int quotient = value/value2;
		 int reste = value+value2;
		 
		System.out.println("L'addition = " + value+value2);

		 
		 
		 
	}

}
