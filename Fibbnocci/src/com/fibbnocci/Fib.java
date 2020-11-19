package com.fibbnocci;

import java.util.Scanner;

public class Fib {
	public static void main(String[] args) {
		System.out.println("enter the number of fibbonnocci series");
		int num=new Scanner(System.in).nextInt();
		for (int i = 1; i <=num; i++) {
			System.out.print(fibb(i)+" ");
		}
		System.out.println("recursion");
		for (int i = 1; i <=num; i++) {
			System.out.print(fibb2(i)+" ");
		}
	}

	private static int fibb2(int rcn) {
		// TODO Auto-generated method stub
		if(rcn==1 || rcn==2) {
			return 1;
		} else {
			return fibb2(rcn-1)+fibb2(rcn-2);
		}		
	}

	private static int fibb(int nb) {
		int fib1=1,fib2=1,fabinocci=1;
		if(nb==1 || nb==2) {
			return 1;
		}else {
			for (int i = 3; i <=nb; i++) {
				fib1=fib2;
				fib2=fabinocci;
				fabinocci=fib1+fib2;				
			}
			return fabinocci;
		}		
	}
	
	
}
