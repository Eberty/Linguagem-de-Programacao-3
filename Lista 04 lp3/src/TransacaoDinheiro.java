public class TransacaoDinheiro extends Transacao {
    double desconto;
    
    public TransacaoDinheiro(double vTransacao, double desconto){
        super(vTransacao);
        this.desconto = desconto / 100;
    }
    
    @Override
    double getTotalTransacao(double vTransacao){
        this.tTransacao = vTransacao - (vTransacao * this.desconto);
        return this.tTransacao;
    }

    @Override
    public void Imprime() {
        System.out.println("Valor Transacao: " + this.vTransacao);
        System.out.println("Desconto: " + this.desconto * 100 + "%");     
        System.out.println("Total Transacao no Dinheiro: " + getTotalTransacao(vTransacao) + "\n");       
    }
}
