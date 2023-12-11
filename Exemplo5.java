package Arrays;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		int vetorInteiros[] = new int[5];
		
		Scanner leia = new Scanner(System.in);
		
		for(int indice = 0; indice < 5; indice++) {
			System.out.println("Digite o " + indice  + "° número: ");
			vetorInteiros[indice] = leia.nextInt();
		}
		
		System.out.println("\nOs numeros digitados foram: \n");
		
		for(int indice = 0; indice < 5; indice++) {
			System.out.println(indice  + "° numero: "  + vetorInteiros[indice]);
		}
		
		

	}

}
