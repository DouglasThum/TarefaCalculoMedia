package Application;

import java.util.Scanner;

import Entities.Notas;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a nota1: ");
		Double not1 = input.nextDouble();
		
		System.out.print("Insira a nota2: ");
		Double not2 = input.nextDouble();
		
		System.out.print("Insira a nota3: ");
		Double not3 = input.nextDouble();
		
		System.out.print("Insira a nota4: ");
		Double not4 = input.nextDouble();
		
		Notas notas = new Notas(not1, not2, not3, not4);
		
		if (notas.calcularMedia() >= 7 ) {
			System.out.println("Média: " + notas.calcularMedia() + " Aproavdo!");
		}
		else {
			System.out.println("Média: " + notas.calcularMedia() + " Reprovado!");
		}
		
		input.close();
	}

}
