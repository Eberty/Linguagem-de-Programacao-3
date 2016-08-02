
/**
 * Nome: DifNivelTipo Tipo: Classe implementadora de Dificultador Descrição:
 * Responsável por devolver uma questão aleatoria de nivel e tipo pré-definidos
 * e não ha informacões a retornar.
 *
 * @author Eberty A.
 *
 */
import java.util.ArrayList;
import java.util.Random;

public class DifNivelTipo implements Dificultador {

    private int nivel;
    private char tipo;

    DifNivelTipo(int nivel, char tipo) {
        this.nivel = nivel;
        this.tipo = tipo;
    }

    @Override
    public Expressao getExpressao(ArrayList<Expressao> listExp) {
        Random aleatorio = new Random();
        Expressao exp;

        do {
            exp = listExp.get(aleatorio.nextInt(listExp.size()));
        } while (exp.getNivel() != nivel || exp.getTipo() != tipo);

        return exp;
    }

    @Override
    public String retornaInfo(Expressao exp, Jogador jog) {
        switch (jog.getInformacao()) {
            case 's':
                return "Não há informações a retornar";
            default:
                return "";
        }
    }

}
