package entidade;
/**
 * Programa Classe abstrata - pessoas fisica e juridica
 * 
 * @author wagne
 * @since 03/07/2022
 */
public class Juridica extends Pessoa{
	
	public static final double SALDOCONTAJURIDICA = 242010050.00;
	
	
	private double saldocontajuridica;

//	private double saldo;
	//private int tipoDaConta;

	public Double getSaldo() {
	       // return salario;
	    	 return SALDOCONTAJURIDICA;
	    }

	@Override
	public double saldo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
