package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número.........: ");
		int n = sc.nextInt();
		
		int sumatoria = 0; //Acumulador
		
		int i = 1;
		
		while (i <= n) {
			sumatoria += i;
			
			if ((i + 1) <= n)
			System.out.print(i + " + ");
			else
				System.out.print(i);
				
			
			i++;
		}
		
		System.out.println(" = " + sumatoria);
		
	}

}
