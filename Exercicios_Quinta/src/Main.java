import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int number,number_after;
	number = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro"));
	number_after = number;
	JOptionPane.showMessageDialog(null, "N�mero informado: " + number + "\nAntecessor do n�mero: " + --number + "\nSucessor do n�mero: " + ++number_after );
}
}
