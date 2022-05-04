package aula_03;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {
	
	public static double CalculaArea(double base, double altura) {
		double area = base*altura;
		return area;
	}
	
	public static double CalculaPerimetro(double base, double altura) {
		return 2 * base + 2 * altura;
	}

	public static void main(String[] args) {
		
		int altura;
		int base,op=0;
	
		/*
		altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura:\n"));
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe a Base:\n"));
		
		double a = CalculaArea(base,altura);
		
		JOptionPane.showMessageDialog(null,"A sua area calculada é: " + new DecimalFormat("#,##0.00").format(a));
		
		JOptionPane.showMessageDialog(null, "Seu perimetro é: " + CalculaPerimetro(base, altura));
		*/
		
		while(op != 99) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Bem-Vindo ao nosso Menu:\n ' 1 - Para Entregar a Pizza \n 2 - Ver o Menu \n 99 - Sair\n"));
		 switch(op) {
		 	case 1:{
		 		JOptionPane.showMessageDialog(null, "Bem-Vindo");
		 		break;
		 	}
		 	case 2:{
		 		JOptionPane.showMessageDialog(null, "Bem-Vindo");
		 		break;
		 	}
		 	default:{
		 		break;
		 	}
		 }
			
		}
		
		
		
		
			
	}

}
