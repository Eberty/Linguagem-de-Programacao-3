/**
 *
 * @author Eberty
 */
public class SuperClasseMotor {
    protected int qQuest;
    Dificultador ref;
    BaseDificultador dif = new BaseDificultador();

    public Dificultador solicitarDif(Jogador jog) {
        this.ref = dif.getDificultador(jog);
        return ref;
    }
    
}
