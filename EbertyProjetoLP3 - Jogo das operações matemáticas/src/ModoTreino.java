
/**
 * Nome: ModoTreino Tipo: Classe implementadora de MotorDoJogo Descrição:
 * Solicita o dificultador, nesse modo o jogador escolhe como deve proseguir o
 * jogo.
 *
 * @author Eberty A.
 *
 */
public class ModoTreino extends SuperClasseMotor implements MotorDoJogo {

    @Override
    public boolean jogoDeFases() { //jogador escolhe se quer fase ou nao
        return false;
    }

    @Override
    public boolean jogoAcabou(Jogador jog) { //jogador escolhe a qtd de erros q pode cometer, se ele fizer tudo acabou
        if (jog.getErros() > jog.getqPodeErrar())
            return true;
        if (jog.getqQuestResp() >= getqQuest())
            return true;
        return (!jog.isContinua()); //ele escolhe se quer acabar
    }

    @Override
    public boolean acertou(Expressao exp, Jogador jog) {
        if (!jog.isRepete())
            jog.setqQuestResp(jog.getqQuestResp() + 1);
        
        if (exp.getResp() != jog.getResp()) {
            if (!jog.isRepete())
                jog.setErros(jog.getErros() + 1);
            jog.setRepete(true);
            return false;
        } else { //olhar se ta fazendo de novo
            if (!jog.isRepete())
                jog.setPontos(jog.getPontos() + 20);
            else
                jog.setPontos(jog.getPontos() + 10);
            jog.setRepete(false);
            return true;
        }
    }

    @Override
    public boolean repetir(Jogador jog) {
        return jog.isRepete(); //por ser treino, ele repete ate acertar
    }

    @Override
    public void passarFase(Jogador jog) {
        //nao ha fases em teino
    }

    @Override
    public int getqQuest() {
        return qQuest;
    }

    @Override
    public void setqQuest(int qQuest) { //faz quantas quiser
        if (qQuest > 0) {
            this.qQuest = qQuest;
        } else {
            this.qQuest = 0;
        }
    }
}
