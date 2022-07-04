package entidade;
/**
 * Programa Classe abstrata - pessoas fisica e juridica
 * 
 * @author wagne
 * @since 04/07/2022
 * @version 0.2
 */
public class Fisica extends Pessoa {

	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double saldo() {
		// TODO Auto-generated method stub
		return 1200.00;
	}
	
	
	
	

	 

}
