
/**
 * Nome: BaseMotorDoJogo Tipo: Classe Descrição: Responsavel por retornar o
 * motor do jogo a ser utilizado
 *
 * @author Eberty A.
 *
 */
public class BaseMotorDoJogo { //coloquei abstract, pq nao instancio

    MotorDoJogo ref;

    public MotorDoJogo getMotorDoJogo(Jogador jog) {
        switch (jog.getModoJogo()) {
            case 1:
                ref = new ModoRapido();
                break;
            case 2:
                ref = new ModoTreino();
                break;
            case 3:
                ref = new ModoCampanha();
                break;
            default:
                return null; //na classse principal eu me certifiquei que isso nao iria acontecer, mas por questao de boa pratica de programacao ha o retorno null caso a opcao seja invalida
        }
        return ref;
    }
}
