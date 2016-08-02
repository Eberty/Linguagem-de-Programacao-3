import java.lang.Math;

public class TransacaoParcelada extends Transacao {
    int qParcelas;
    double txJuros;
    
    public TransacaoParcelada(double vTransacao, int qPparcelas, double txJuros) {
        super(vTransacao);
        this.qParcelas = qPparcelas;
        this.txJuros = txJuros / 100;
    }
    
    @Override
     double getTotalTransacao(double vTransacao) {
        this.tTransacao = (double) (vTransacao * (Math.pow((1 + this.txJuros),this.qParcelas)));
        return this.tTransacao;
    }
    
     @Override
     public  void Imprime(){
       System.out.println("Valor da Transacao: " + this.vTransacao);
       System.out.println("Quantidade de Parcelas: " + this.qParcelas);
       System.out.println("Taxa de Juros: " + this.txJuros * 100 + "% ao mes");
       System.out.println("Total da Transacao parcelada: " + getTotalTransacao(vTransacao) + "\n");         
    }
}