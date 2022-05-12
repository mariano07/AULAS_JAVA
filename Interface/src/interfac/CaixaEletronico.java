package interfac;

public interface CaixaEletronico {
	
	void sacar(float valor);
	default void VerificaFraude() {
		System.out.println("Iniciada a Verificação de Fraude!");
	}
	

}
