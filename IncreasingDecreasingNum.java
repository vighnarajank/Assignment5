package com.onebill.corejava.assignment5;

import java.util.Scanner;

import java.lang.Math;

public class IncreasingDecreasingNum {
	
	public static void main(String[] args) {
		System.out.print("Enter Number-1 : ");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		System.out.print("Enter Number-2 : ");
		int input2 = sc.nextInt();
		System.out.print("Enter Number-3 : ");
		int input3 = sc.nextInt();
		sc.close();
		findProperty(input1);
		findProperty(input2);
		findProperty(input3);
	}
	
	static void findProperty(int input) {
		int length = String.valueOf(input).length();
		int rem;
		int flag=1;
		int first = (int) (input/(Math.pow(10, length-1))); //finds first digit of a number
		int last = input % 10;								//finds last digit of a number
		if(last > first) {									
			int gtr= input%10;								//this is the last digit
			for(int i=2;i<length;i++) {						//here i starts from 2 but the number's digits are traversed in reverse manner
				rem = (int) (input/(Math.pow(10, i-1))%10); //separates each and every digit in number and goes to the previous of previous digit
				flag = (gtr>rem) ? 1 : 0;					//comparing the current digit with previous digit
				gtr = rem;									//assigning the previous digit as current digit
//				System.out.println("\nRem:"+rem);
//				System.out.println("gtr:"+gtr);
//				System.out.println("Flag:"+flag);
				if(flag==0) {
					System.out.println("The number is neither decrementing nor incrementing");
					break;
				}
			}
		}
		else if(last < first){
			int gtr = input%10;
			for(int i=2; i<length; i++) {
				rem = (int) (input/(Math.pow(10, i-1))%10);
//				System.out.println("\ngtr:"+gtr);

				flag = (gtr<rem) ? 2 : 0;
				gtr = rem;
//				System.out.println("Rem:"+rem);
//				System.out.println("gtr:"+gtr);
//				System.out.println("Flag:"+flag);
				if(flag==0) {
					System.out.println("The number is neither decrementing nor incrementing");
					break;
				}
			}
		}
		else if (last == first) {
			flag=0;
			System.out.println("The number is neither decrementing nor incrementing");
		}
		if(flag==1) {
			System.out.println("The number is increasing");
		}
		else if(flag==2) {
			System.out.println("The number is decreasing");
		}
	}
}
