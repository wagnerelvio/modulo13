package entidade;

/**
 * Programa Classe abstrata - pessoas fisica e juridica
 * 
 * @author wagne
 * @since 04/07/2022
 * @version 0.2
 */
public class Juridica extends Pessoa {
	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double saldo() {
		// TODO Auto-generated method stub
		return 20000.00;
	}

	
	
	
	

}
