
/**
 * Nome: DifAleatorio Tipo: Classe implementadora de Dificultador Descrição:
 * Responsável por devolver uma questão aleatoria de qualquer tipo ou nivel e
 * suas informações relevantes.
 *
 * @author Eberty A.
 *
 */
import java.util.ArrayList;
import java.util.Random;

public class DifAleatorio implements Dificultador {

    public DifAleatorio() {

    }

    @Override
    public Expressao getExpressao(ArrayList<Expressao> listExp) {
        Random aleatorio = new Random();
        return listExp.get(aleatorio.nextInt(listExp.size()));
    }

    @Override
    public String retornaInfo(Expressao exp, Jogador jog) {
        switch (jog.getInformacao()) {
            case 's':
                return "Você esta a responder uma questão do nivel: " + exp.getNivel() + " com uma operacao do tipo " + exp.getTipo();
            default:
                return "";
        }
    }

}
