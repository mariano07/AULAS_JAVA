package quinta;

import javax.swing.JOptionPane;

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
		 int numero = 10;
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html><table>");
		for (int ui = 0; ui < 10; ui++) {
		    sb.append("<tr><td>");
		    sb.append(numero);
		    sb.append("</tr></td>");
		    for (int k = 0; k < 5; k++){
		        sb.append("<td>");
		        sb.append(numero);
		        sb.append("</td>");
		    }
		    sb.append("</tr>");
		}
		sb.append("</table></html>");
		JOptionPane.showMessageDialog(null, sb.toString());
		
		//TesteMatriz(3, 30);
		
	}

}
