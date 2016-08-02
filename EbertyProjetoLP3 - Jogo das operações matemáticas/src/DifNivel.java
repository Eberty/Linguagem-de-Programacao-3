
/**
 * Nome: DifANivel Tipo: Classe implementadora de Dificultador Descrição:
 * Responsável por devolver uma questão aleatoria de um nivel pré-definido e
 * suas informações relevantes.
 *
 * @author Eberty A.
 *
 */
import java.util.ArrayList;
import java.util.Random;

public class DifNivel implements Dificultador {

    private int nivel;

    public DifNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public Expressao getExpressao(ArrayList<Expressao> listExp) {
        Random aleatorio = new Random();
        Expressao exp;

        do {
            exp = listExp.get(aleatorio.nextInt(listExp.size()));
        } while (exp.getNivel() != nivel);

        return exp;
    }

    @Override
    public String retornaInfo(Expressao exp, Jogador jog) {
        switch (jog.getInformacao()) {
            case 's':
                return "Você esta a responder uma questão do tipo " + exp.getTipo();
            default:
                return "";
        }
    }

}
