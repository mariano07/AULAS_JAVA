package interfac;

public abstract class Caixa implements CaixaEletronico {		
	
	public void sacar(float valor) {
		System.out.println("Vou sacar: " + valor);
	}
}
