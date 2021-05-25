package com.onebill.corejava.assignment5;

import java.util.Scanner;

public class SumOddNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2 == 0) {
				continue;
			}
			else {
				sum += i ;
			}
		}
		System.out.println("The sum is : "+ sum);
	}

}
