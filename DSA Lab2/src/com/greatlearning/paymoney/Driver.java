package com.greatlearning.paymoney;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of transaction array i.e. number of days you want to track");
		int size= sc.nextInt();
		int[] transactions= new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter daily transactions in crores of Day: "+ (i+1));
			transactions[i]= sc.nextInt();
		}
		
		System.out.println("Enter the target amount in crores that needs to be achieved");
		int targetAmount= sc.nextInt();
		
		PayMoney pm= new PayMoney();
		int numberOfDays = pm.numberOfDays(transactions, targetAmount);
		if (numberOfDays == -1) {
			System.out.println("The target "+ targetAmount+ " is not acheived!!");
		}	
		else {
			System.out.println("The target "+ targetAmount + " crores is acheived in "+ numberOfDays+ " days.");
		}
			
		
		sc.close();

	}

}
