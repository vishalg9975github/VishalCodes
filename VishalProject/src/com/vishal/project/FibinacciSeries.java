package com.vishal.project;

import java.util.Scanner;

//fibonacci series 0,1,1,2,3,5,8,13,21
public class FibinacciSeries {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scanner.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=3;i<=n;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
