package com.onebill.corejava.assignment5;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		int c;
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n-1;j++) { 
				System.out.print("\t"); 
			}
			c = 1;
			for(int j=1;j<=i;j++) {
				System.out.print(c + "\t\t");
				c = c*(i-j)/j;
			}
			System.out.println();
		}
	}

}
