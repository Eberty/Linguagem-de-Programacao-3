
/**
 * Nome: Dificultador Tipo: Interface Descrição: Interface que representa
 * classes responsaveis por receber uma lista do tipo expressao e retornar uma
 * expressao aleatoria Obs.: Existe a opcao de retorno de informacoes escolhida
 * pelo jogador
 *
 * @author Eberty A.
 *
 */
import java.util.ArrayList;

public interface Dificultador {

    public Expressao getExpressao(ArrayList<Expressao> expressoes);

    public String retornaInfo(Expressao exp, Jogador jog);
}
