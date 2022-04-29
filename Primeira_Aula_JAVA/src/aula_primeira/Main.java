package aula_primeira;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome,nome2;
		
		nome = JOptionPane.showInputDialog("Informe seu nome:\n");
		nome2 = JOptionPane.showInputDialog("Informe seu nome:\n");

		if (nome.equals(nome2)){
			JOptionPane.showMessageDialog(null, "Nome igual");
		}else {
			JOptionPane.showMessageDialog(null, "Diferente:\n");
		}
	}

}
