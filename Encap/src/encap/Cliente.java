package encap;

public class Cliente {
	private static String nome;
	private String endereco;
	private String cpf;
	private int idade;
	private double saldo;
	
	public void Add_NOME(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void add_CPF(String cpf) {
		this.cpf = cpf;
	}
	
	public void mudaCPF(String cpf) {
		validaCPF(cpf);
		System.out.print(this.cpf);
	}
	
	private void validaCPF(String cpf) {
		if (cpf == this.cpf) {
			this.cpf = cpf;
			System.out.print(true);
		}else {
			System.out.print(false);
		}
	}
	
	
		

}
