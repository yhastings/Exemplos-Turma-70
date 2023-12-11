package Arrays;

public class Exemplo4 {

	public static void main(String[] args) {
	
		String vetorString[] = {"Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "corgi"};
		
		int vetorInteiros[] = {1, 2, 3, 4, 5};
		
		for(int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) +  "° Elemento " + vetorString[indice]);
		}
		
		for(int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) +  "° Elemento " + vetorInteiros[indice]);
		}
	}

}
