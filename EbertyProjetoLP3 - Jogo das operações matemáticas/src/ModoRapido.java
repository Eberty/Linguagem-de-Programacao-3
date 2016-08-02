
/**
 * Nome: ModoRapido Tipo: Classe implementadora de MotorDoJogo Descrição:
 * Solicita o dificultador, não eh um jogo de fases, pode acabar de varias
 * formas diferentes.
 *
 * @author Eberty A.
 *
 */
public class ModoRapido extends SuperClasseMotor implements MotorDoJogo {

    @Override
    public boolean jogoDeFases() {//jogo rapido nao pode mudar de fase, ou eh a msm sempre ou eh aleatoria
        return false;
    }

    @Override
    public boolean jogoAcabou(Jogador jog) { //se ele errou 3 ou se ele atigiu a qtd max de questoes
        if (jog.getErros() >= 3) {
            return true;
        }
        if (jog.isContinua() == false) {
            return true;
        }
        return (jog.getqQuestResp() >= getqQuest());
    }

    @Override
    public boolean acertou(Expressao exp, Jogador jog) {
        jog.setqQuestResp(jog.getqQuestResp() + 1);
        if (exp.getResp() != jog.getResp()) {
            jog.setErros(jog.getErros() + 1);
            return false;
        } else {
            jog.setPontos(jog.getPontos() + 20);
            return true;
        }
    }

    @Override
    public boolean repetir(Jogador jog) { //modo rapido nao pode repetir
        return false;
    }

    @Override
    public void passarFase(Jogador jog) {
        //nao ah fases nesse modo
    }

    @Override
    public int getqQuest() {
        return qQuest;
    }

    @Override
    public void setqQuest(int qQuest) { //max de 20 questoes
        if (qQuest <= 20 && qQuest > 0) {
            this.qQuest = qQuest;
        } else if (qQuest > 20) {
            this.qQuest = 20;
        } else {
            this.qQuest = 0;
        }
    }
}
