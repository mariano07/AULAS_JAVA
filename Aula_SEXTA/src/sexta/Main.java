package sexta;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		LivroDeNotas escola = new LivroDeNotas();
		LivroDeNotas escola1 = new LivroDeNotas();
		
		escola.Add_Aluno();
		escola.Media();
		/*
		escola.setObs(JOptionPane.showInputDialog("Inform seu Nome:\n"));
		JOptionPane.showMessageDialog(null, escola.getObs());
			*/
	
	}

}
