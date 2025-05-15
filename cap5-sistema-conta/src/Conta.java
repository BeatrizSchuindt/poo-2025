
public class Conta {
    
	private int id;
	private String titular;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;
    
    private static int contadorId = 1;
    
    //Construtor - sem parametro
    public Conta() {
    	this.id = contadorId;
    	contadorId++;
    	System.out.println("Conta criada sem titular.");
    }

    //construtor com parâmetros
    public Conta(String titular) {
    	this.titular = titular;
    	this.id = contadorId;
    	contadorId++;
    	System.out.println("Conta de " + titular);
    }
    
    //GET E SETS
    public int getID() {
		return id;
	}

	/*para mim, não deve ter set pois id é único
	 * public void setNumero(int id) { 
		this.id = id;
	}*/
	
    public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	/*public void setSaldo(double saldo) {
		this.saldo = saldo;                  //Já tem o método saca e deposita
	}*/

	public Data getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public void saca(double valor) {
    	if(valor < this.saldo) {
    		System.out.println("SALDO INSUFICENTE! Tente novamente!");
    	} else {
    		this.saldo -= valor;
    		System.out.println("O valor de R$" + valor + " foi sacado com SUCESSO!");
    	}
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    public double getRendimento() {
        return this.saldo * 0.1;
    }
    
    public String recuperaDadosParaImpressao() {
    	String dados = "Titular: " + this.titular;
        dados += "\nID da conta: " + this.id;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$ " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura.dataFormatada();
        dados += "\nRendimento mensal: R$ " + this.getRendimento();
        return dados;
    }
}
