package programa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entidade.Fisica;
import entidade.Pessoa;

public class Aplicacao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Fisica joao = new Fisica(null, null, null, null);
		System.out.println("\n **********************************");
		System.out.println(" ********* Pessoa Física************ ");
		Fisica pessoa = new Fisica();
		pessoa.setNome("João");
		pessoa.setSobrenome("Carlos");
		// pessoa.setNumeroConta("1010");
		// pessoa.imprimirSaldo();
		pessoa.setNumeroConta("101");
		pessoa.setTipoDaConta("Fisica");
		imprimir(pessoa);

		System.out.println("\n **********************************");
		System.out.println(" ********* Pessoa Juridica********** ");
		Fisica juridica = new Fisica();
		juridica.setNome("J&A");
		juridica.setSobrenome("Company");
		// pessoa.setNumeroConta("1010");
		// pessoa.imprimirSaldo();
		juridica.setNumeroConta("202");
		juridica.setTipoDaConta("Juridica");
		imprimir(juridica);

	}

	public static void imprimir(Pessoa pessoa) {

		// pessoa.imprimirNome();
		// pessoa.imprimirSaldo();
		// pessoa.imprimirnumeroConta();

		/*
		 * empregado.imprimirNome(); empregado.imprimirSobrenome();
		 * empregado.imprimirValores();
		 */

//		System.out.println(empregado.getNome() + " tem salário: " + empregado.vencimento());

		// System.out.println("
		// aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("Nome do titular: " + pessoa.getNome() + " " + pessoa.getSobrenome());
		System.out.println("O tipo da conta é : " + pessoa.getTipoDaConta());
		System.out.println(pessoa.getNome() + " tem saldo na conta: " + pessoa.saldo());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("\n **  Data e hora: " + dtf.format(LocalDateTime.now()));
	}

}
