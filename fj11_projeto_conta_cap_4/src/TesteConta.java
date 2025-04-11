
public class TesteConta {
    
    public static void main(String[] args) {
        Data data = new Data();
        
        data.dia = 11;
        data.mes = 4;
        data.ano = 2025;
        
        Conta c1 = new Conta();
        c1.titular = "Beatriz";
        c1.numero = 1234;
        c1.agencia = "001";
        c1.saldo = 1500.00;
        c1.dataDeAbertura = data;

        System.out.println(c1.recuperaDadosParaImpressao());

        c1.saca(200.00);
        System.out.println("\n--- SAQUE de R$ 200,00 ---");
        System.out.println("Saldo: R$ " + c1.saldo);

        c1.deposita(350.00);
        System.out.println("\n--- DEPÓSITO de R$ 350,00 ---");
        System.out.println("Saldo: R$ " + c1.saldo);
    }
}
