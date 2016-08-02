
/**
 * Nome: DifATipo Tipo: Classe implementadora de Dificultador Descrição:
 * Responsável por devolver uma questão aleatoria de um tipo pré-definido e suas
 * informações relevantes.
 *
 * @author Eberty A.
 *
 */
import java.util.ArrayList;
import java.util.Random;

public class DifTipo implements Dificultador {

    private char tipo;

    public DifTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public Expressao getExpressao(ArrayList<Expressao> listExp) {
        Random aleatorio = new Random();
        Expressao exp;

        do {
            exp = listExp.get(aleatorio.nextInt(listExp.size()));
        } while (exp.getTipo() != tipo);

        return exp;
    }

    @Override
    public String retornaInfo(Expressao exp, Jogador jog) {
        switch (jog.getInformacao()) {
            case 's':
                return "Você esta a responder uma questão do nivel " + exp.getNivel();
            default:
                return "";
        }
    }

}
