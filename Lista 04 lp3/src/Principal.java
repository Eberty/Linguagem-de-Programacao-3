public class Principal {
    public static void main(String[] args) {
        Transacao clienteA = new Transacao(400);
        TransacaoParcelada clienteB = new TransacaoParcelada(1000,10,2);
        TransacaoDinheiro clienteC = new TransacaoDinheiro(100,10);
        
        clienteA.Imprime();
        clienteB.Imprime();
        clienteC.Imprime();
    }
}
