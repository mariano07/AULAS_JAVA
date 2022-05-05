package array;

public class Main {
	
	public static int[] testeVetor(int tamanho){
		int[] vetor = new int[tamanho];
		
		for (int i=0; i<=vetor.length;i++) {
			if (i % 2 == 0) {
				vetor[i] = 0;
			}else {
				vetor[i] = 1;
			}
		
		for (int elemento : vetor) {
			System.out.print(elemento);
		}
		}
		
		return vetor;
	}

	public static void main(String[] args) {
		testeVetor(5);
	}

}
