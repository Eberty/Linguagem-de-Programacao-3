
/**
 * Nome: ModoCampanha Tipo: Classe implementadora de MotorDoJogo Descrição:
 * Solicita o dificultador, eh um jogo de fases de modo campanha (onde o jogador
 * evolui com o tempo).
 *
 * @author Eberty A.
 *
 */
public class ModoCampanha extends SuperClasseMotor implements MotorDoJogo {


    @Override
    public boolean jogoDeFases() { //eh campanha
        return true;
    }

    @Override
    public boolean jogoAcabou(Jogador jog) {
        if (jog.getErros() > jog.getqPodeErrar())
            return true;
        if (jog.getqQuestResp() >= getqQuest())
            return true;
        return (!jog.isContinua());
    }

    @Override
    public boolean acertou(Expressao exp, Jogador jog) {
        if (jog.getRepeticoes() == 0) //se eh a primeira vez q ele ta jogando
            jog.setqQuestResp(jog.getqQuestResp() + 1);

        if (exp.getResp() != jog.getResp()) {
            if (jog.getRepeticoes() == 0) //se eh a primeira vez q ele ta jogando
                jog.setErros(jog.getErros() + 1);
            jog.setRepeticoes(jog.getRepeticoes() + 1);
            return false;
        } else {
            if (jog.getRepeticoes() == 0)
                jog.setPontos(jog.getPontos() + 20);
            else
                if (jog.getRepeticoes() == 1)
                    jog.setPontos(jog.getPontos() + 10);
            jog.setRepeticoes(0);
            return true;
        }
    }

    @Override
    public boolean repetir(Jogador jog) {
        return (jog.getRepeticoes() == 1);
    }

    @Override
    public void passarFase(Jogador jog) {
        if ( (jog.getqQuestResp() % 12 == 0) && (jog.getNivelAtual() < 5)){
                jog.setNivelAtual(jog.getNivelAtual() + 1);
        }
    }

    @Override
    public int getqQuest() {
        return qQuest;
    }

    @Override
    public void setqQuest(int qQuest) { //12 questoes por nivel
        this.qQuest = 60;
    }
}
