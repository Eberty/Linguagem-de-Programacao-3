
/**
 * Nome: Jogador
 * Tipo: Classe (Auxiliar)
 * Descrição: Classe auxiliar, ajuda a deixar o codigo mais inxuto.
 *            O jogador é possuidor de muitos atributos, que saão aqui armazenados para ajudar como parametros passados para o motor do jogo.
 * 
 * @author Eberty A.
 * 
 */
public class Jogador {

    private int modoJogo;
    private int escolheDif;
    private int qPodeErrar;
    private double resp;
    private char informacao;
    private boolean continua = true;
    private boolean repete;
    private int repeticoes = 0;
    private boolean jogoComFases;
    private int nivelAtual;
    private char oper;
    private int qQuestResp = 0;
    private int erros = 0;
    private int pontos = 0;

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }
    
    public int getErros() {
        return erros;
    }

    public int getPontos() {
        return pontos;
    }

    public double getResp() {
        return resp;
    }

    public int getqQuestResp() {
        return qQuestResp;
    }

    public boolean isContinua() {
        return continua;
    }

    public boolean isJogoComFases() {
        return jogoComFases;
    }

    public boolean isRepete() {
        return repete;
    }

    public void setContinua(boolean continua) {
        this.continua = continua;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public void setJogoComFases(boolean jogoComFases) {
        this.jogoComFases = jogoComFases;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setRepete(boolean repete) {
        this.repete = repete;
    }

    public void setResp(double resp) {
        this.resp = resp;
    }

    public void setqQuestResp(int qQuestResp) {
        this.qQuestResp = qQuestResp;
    }

    public int getEscolheDif() {
        return escolheDif;
    }

    public void setEscolheDif(int escolheDif) {
        this.escolheDif = escolheDif;
    }

    public int getqPodeErrar() {
        return qPodeErrar;
    }

    public void setqPodeErrar(int qPodeErrar) {
        this.qPodeErrar = qPodeErrar;
    }

    public char getInformacao() {
        return informacao;
    }

    public void setInformacao(char informacao) {
        this.informacao = informacao;
    }

    public int getNivelAtual() {
        return nivelAtual;
    }

    public void setNivelAtual(int nivelAtual) {
        this.nivelAtual = nivelAtual;
    }

    public char getOper() {
        return oper;
    }

    public void setOper(char oper) {
        this.oper = oper;
    }

    public int getModoJogo() {
        return modoJogo;
    }

    public void setModoJogo(int modoJogo) {
        this.modoJogo = modoJogo;
    }
}
