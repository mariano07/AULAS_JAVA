package sexta;

import javax.swing.JOptionPane;

public class LivroDeNotas {
	String nomealuno,status;
	private int n1,n2,n3,matricula;
	private double media;
	private String obs="";
	
	
	public String getObs() {
		return obs;
	}
	
	public void setObs(String obs) {
		this.obs = obs;
	}
		
	private void Add_Aluno(){
		nomealuno = JOptionPane.showInputDialog("Informe um nome de aluno\n");
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira nota do aluno\n"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda nota do aluno\n"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a terçeira nota do aluno\n"));
		matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a Matricula do Aluno\n"));
	}
	
	public void Media(){
		
		media = (n1+n2+n3)/3;
		
		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado: " + nomealuno + "\nCom media: " + media);
			status = "Aluno Aprovado";
		}else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado: " + nomealuno + "\nCom media: " + media);
			status = "Aluno Reprovado";
		}
	}	
	
	
	public void Status() {
		
		if (status.equals("Aluno Aprovado")){
			JOptionPane.showMessageDialog(null, "Parabens Aprovado!\n");
			
		}else if (status.equals("Aluno Reprovado"))  {
			JOptionPane.showMessageDialog(null, "Você Reprovou!");
		
	}

}
}
