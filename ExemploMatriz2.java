package Arrays;

public class ExemploMatriz2 {

	public static void main(String[] args) {
		int matrizInteiros[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		
		for(int indiceLinha = 0; indiceLinha < 3; indiceLinha++ ) {
			for(int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {
				System.out.println("O Valor armazenado na posilção [ " + indiceLinha + "][" + indiceColuna + "] é: " + matrizInteiros[indiceLinha][indiceColuna]);
			}
		}
	}

}
