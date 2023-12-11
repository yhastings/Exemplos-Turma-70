package Arrays;

public class ExemploForEach2 {

	public static void main(String[] args) {
		String alunes[][] = {{"Larissa", "Dani", "Igor"}, {"Thaiana", "Tais", "Thayná"}, {"Nat", "Nathan", "Nathália"}};
		
		for(String[] linha: alunes ) {
			for(String alune: linha) {
				System.out.println(alune);
			}
		}
	}

}
