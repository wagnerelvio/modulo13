package entidade;
/**
 * Programa Classe abstrata - pessoas fisica e juridica
 * 
 * @author wagne
 * @since 04/07/2022
 * @version 0.2
 */
public abstract class Pessoa {

	private String nome;

	protected String sobrenome;

	private String endereco;
	private String numeroConta;
	private String tipoDaConta;
	private String saldo;

	public abstract double saldo();

	public void imprimirNome() {
		System.out.println("O seu nome é " + this.nome);
	}

	public void imprimirSaldo() {
		double valor = saldo();
		System.out.println("Saldo: " + valor);
	}

	public void imprimirnumeroConta() {
		System.out.println("O numero de sua conta é: " + this.numeroConta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipoDaConta() {
		return tipoDaConta;
	}

	public void setTipoDaConta(String tipoDaConta) {
		this.tipoDaConta = tipoDaConta;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	
}
