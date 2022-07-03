package entidade;
/**
 * Programa Classe abstrata - pessoas fisica e juridica
 * 
 * @author wagne
 * @since 03/07/2022
 */
public class Fisica extends Pessoa {

	
	public static final double SALDO = 10050.00;
	//public static final double HORAAULADISCIPLINAPORDIA = 3;
	//public static final double VALORHORAAULADISCIPLINAPORDIA = 100;
	
	private double saldo;
	//private int tipoDaConta;

	public Double getSaldo() {
	       // return salario;
	    	 return SALDO;
	    }
 
	
	
	@Override
	public double saldo() {
		// TODO Auto-generated method stub
		return SALDO;
	}

	 

}
