
public class Conta {
    
	String titular;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;

    void saca(double valor) {
        this.saldo -= valor;
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    double calculaRendimento() {
        return this.saldo * 0.1;
    }
    
    String recuperaDadosParaImpressao() {
    	String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$ " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura.dataFormatada();
        dados += "\nRendimento mensal: R$ " + this.calculaRendimento();
        return dados;
    }
}