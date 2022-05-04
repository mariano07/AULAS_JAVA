package segunda_aula;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//primeiro contato com objeto JOPTIONPANE
		/*
		String nome,nom="Mariano Bitelo",cidade,endereco;
		int cep=0,telefone=0;
		
		JOptionPane.showMessageDialog(null, "Bem-Vindo a nossa agenda do SENAC em JAVA");
		nome = JOptionPane.showInputDialog("Favor Informe o seu nome:\n");
		cidade = JOptionPane.showInputDialog("Favor informe a sua cidade:\n");
		endereco = JOptionPane.showInputDialog("Favor informa o seu endereço:\n");
		cep = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o seu CEP:\n"));
		//telefone = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o seu telefone:\n"));
		
		JOptionPane.showMessageDialog(null, "os Dados que inseriu foram: Nome:\n"+ nome + "\nCidade:" + cidade + "\nEndereço:"+ endereco + "\nCEP:"+ cep + "\nTelefone:" + telefone);
		
		
		telefone = Integer.parseInt(JOptionPane.showInputDialog("Inform seu telefone:\n"));
		
		
		if (nome.equals(nom)) {
			JOptionPane.showMessageDialog(null, "Seu nome esta correto");
		}else {
			JOptionPane.showMessageDialog(null, "Voce não pode entrar");
		}*/
		
		// declaração (s vale null)
		String s;
		// inicialização
		s = "Ana dos Santos";
		// declaração e inicialização
		String s2 = "Roberto Padilha";

		System.out.println("Igual: " + s.equals("Ana dos Santos"));		
		System.out.println("Tamanho de s: " + s.length());
		System.out.println("Caracter da posição 5 de s2: " + s2.charAt(5));

		
		
	
	}

}
