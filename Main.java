package org.DataStructure;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		BankCounter obj = new BankCounter(5);
		
		Scanner sc = new Scanner(System.in);
		
		
		int ch;
		while (true) {
			System.out.println("Please enter the number : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the customer name : ");
				String name = sc.next();
				System.out.println("Plese the amount :");
				int amount = sc.nextInt();
				obj.enqueue(amount, name);
				break;
			case 2:
				obj.dequeue();
				break;
			case 3:
				obj.display();
				break;
			case 4:
				sc.close();
				return;
			default:
			System.out.println("Error... Please Enter the vaild choice :  ");
			}
		}
	}

}
