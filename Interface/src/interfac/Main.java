package interfac;

public class Main {

	public static void main(String[] args) {
		CaixaEletronico caixa = new Caixa() {
		};
		caixa.sacar(100);
		caixa.sacar(200);
		caixa.sacar(300);
		caixa.sacar(400);
		caixa.VerificaFraude();
		caixa.VerificaFraude();
		caixa.VerificaFraude();
		
			
	}
}
