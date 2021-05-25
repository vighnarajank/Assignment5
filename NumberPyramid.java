package com.onebill.corejava.assignment5;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n-1;j++) {
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i + "\t\t");
			}
			System.out.println();
		}
	}

}
