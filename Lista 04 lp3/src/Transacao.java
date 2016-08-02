public class Transacao {
    double vTransacao, tTransacao;
    
    public Transacao(double vTransacao){
        this.vTransacao = vTransacao;
    }
    
    double getTotalTransacao(double vTransacao){
        this.tTransacao = vTransacao;
        return this.tTransacao;
    }
    
    public void Imprime() {
        System.out.println("Valor da Transacao: " + this.vTransacao);
        System.out.println("Total da Transacao com cartao de Debito ou credito em 1 parcela: " + getTotalTransacao(vTransacao) + "\n");     
    }
}