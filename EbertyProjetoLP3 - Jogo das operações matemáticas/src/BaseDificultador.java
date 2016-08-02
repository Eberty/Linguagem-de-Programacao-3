
/**
 * Nome: BaseDificultador Tipo: Classe Descrição: Classe que possui um metodo q
 * retorna um Dificultador (não implementa, apenas retorna)
 *
 * @author Eberty A.
 *
 */
public class BaseDificultador {

    Dificultador ref;

    public Dificultador getDificultador(Jogador jog) {
        switch (jog.getEscolheDif()) {
            case 1:
                ref = new DifAleatorio();
                break;
            case 2:
                ref = new DifNivel(jog.getNivelAtual());
                break;
            case 3:
                ref = new DifTipo(jog.getOper());
                break;
            case 4:
                ref = new DifNivelTipo(jog.getNivelAtual(), jog.getOper());
                break;
            default:
                return null;
        }
        return ref;
    }
}
