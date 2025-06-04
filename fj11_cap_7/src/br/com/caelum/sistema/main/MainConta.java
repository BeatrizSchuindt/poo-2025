package br.com.caelum.sistema.main;

import br.com.caelum.sistema.conta.Conta;
import br.com.caelum.sistema.util.Data;

public class MainConta {
	public static void main(String[] args) {
		Data data = new Data();

		data.dia = 11;
		data.mes = 4;
		data.ano = 2025;

		Conta c1 = new Conta(); // construtor sem titular no parametro
		c1.setTitular("Beatriz");
		c1.setAgencia("001");
		c1.deposita(1000.00);
		c1.deposita(200.00);
		c1.setDataDeAbertura(data);

		System.out.println(c1.recuperaDadosParaImpressao());

		/*
		 * c1.saca(200.00); System.out.println("\n--- SAQUE de R$ 200,00 ---");
		 * System.out.println("Saldo: R$ " + c1.getSaldo());
		 * 
		 * c1.deposita(350.00); System.out.println("\n--- DEPÓSITO de R$ 350,00 ---");
		 * System.out.println("Saldo: R$ " + c1.getSaldo());
		 */

		System.out.println("");

		Conta c2 = new Conta("Henrique"); // construtor com parametro
		c2.setAgencia("002");
		c2.deposita(800.00);
		c2.deposita(200.00);
		c2.setDataDeAbertura(data);
		System.out.println(c2.recuperaDadosParaImpressao());

		System.out.println("");
	}
}
