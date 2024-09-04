public class ContaTerminal {
    public static void main(String[] args) {
        Banco bancoDoBrasil = new Banco();
        bancoDoBrasil.setNome("Banco do Brasil");

        Cliente alfredo = new Cliente();
        alfredo.setNome("Alfredo");
        bancoDoBrasil.adicionarCliente(alfredo);

        Conta cc = new ContaCorrente(alfredo);
        Conta poupanca = new ContaPoupanca(alfredo);

        cc.depositar(100);
        cc.tranferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
    }
}