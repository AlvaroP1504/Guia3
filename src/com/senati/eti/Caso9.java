package com.senati.eti;


import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");

		
		System.out.print("Ingrese nombre de alumno............: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese primera nota................: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Ingrese segunda nota................: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Ingrese tercera nota................: ");
		float nota3 = sc.nextFloat();
				
		System.out.print("Ingrese n�mero de asistencias[0-12].......: ");
		float na = sc.nextFloat();
		
		float promedio = nota1 * 0.2f + nota2 *0.3f + nota3 * 0.5f;
		
		float pa = na/12;
		
		String estado = "Sin Certificado";
		if (promedio >= 13 && pa >= 0.7)
			estado = "Obtiene Certificado";
		
		
		
		System.out.println("\n============Resultados=================");
		System.out.println("Alumno.........: "+nombre);
		System.out.println("Promedio.......: "+df.format(promedio));
		System.out.println("Asistencia.....: "+df.format(pa * 100)+ "%");
		System.out.println("Estado.........: "+estado);
	}

}
