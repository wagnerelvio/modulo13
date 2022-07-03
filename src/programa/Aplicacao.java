package programa;
/**
 * Programa Classe abstrata - pessoas fisica e juridica
 * 
 * @author wagne
 * @since 03/07/2022
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entidade.Fisica;
import entidade.Pessoa;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Fisica joao = new Fisica(null, null, null, null);
		System.out.println("\n **********************************");
		System.out.println(" ********* Pessoa Física************ ");
		Fisica pessoa = new Fisica();
		pessoa.setNome("João");
		pessoa.setSobrenome("Carlos");
		pessoa.setNumeroConta("101");
		pessoa.setTipoDaConta("Fisica");
		imprimir(pessoa);

		System.out.println("\n **********************************");
		System.out.println(" ********* Pessoa Juridica********** ");
		Fisica juridica = new Fisica();
		juridica.setNome("J&A");
		juridica.setSobrenome("Company");
		juridica.setNumeroConta("202");
		juridica.setTipoDaConta("Juridica");
		imprimir(juridica);

	}

	public static void imprimir(Pessoa pessoa) {

		System.out.println("Nome do titular: " + pessoa.getNome() + " " + pessoa.getSobrenome());
		System.out.println("O tipo da conta é : " + pessoa.getTipoDaConta());
		System.out.println(pessoa.getNome() + " tem saldo na conta: " + pessoa.saldo());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("\n **  Data e hora: " + dtf.format(LocalDateTime.now()));
	}

}
