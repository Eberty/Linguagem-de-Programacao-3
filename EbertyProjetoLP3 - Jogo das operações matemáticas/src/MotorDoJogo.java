
/**
 * Nome: Motor do jogo Tipo: Interface Descrição: Interface que representa o
 * funcionamento e a lógica do jogo. Responsavel por controlar o andamento do
 * jogo. Independentemente do funcionamento, a classe Principal deverá interagir
 * com essas implementacoes da mesma forma. Obs.: As implementações de
 * MotorDoJogo devem solicitar os dificultadores de BaseDificultador e não pode
 * haver referencias diretas a Dificultador.
 *
 * @author Eberty A.
 *
 */
public interface MotorDoJogo {

    public Dificultador solicitarDif(Jogador jog);

    public boolean jogoAcabou(Jogador jog);

    public boolean acertou(Expressao exp, Jogador jog);

    public boolean repetir(Jogador jog);

    public boolean jogoDeFases();

    public void passarFase(Jogador jog);

    public int getqQuest();

    public void setqQuest(int qQuest);
}
