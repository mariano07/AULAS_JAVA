package quinta;

public class Main {
	
	public static int[][] TesteMatriz (int l, int c){
		int [][] matriz = new int [l][c];
		
		for (int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[0].length; j++) {
				if (i % 2  == 1) {
					matriz [i][j] = 0;
				}else {
					matriz [i][j] = 1;
				}
			}
		}
		
		for (int [] linha : matriz) {
			System.out.print("\n");
			for (int elemento : linha) {
				System.out.print(" " + elemento);
			}
		}
		
		return matriz;
	}
	
	public static void main(String[] args) {
		
		TesteMatriz(3, 30);
		
	}

}
