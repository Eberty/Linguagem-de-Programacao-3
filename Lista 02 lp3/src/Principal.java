/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eberty
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente01 = new Paciente ("Eberty",'m',173,200,70,23);
        Paciente paciente02 = new Paciente ("Juan",'m',160,200,78,25);
        Paciente paciente03 = new Paciente ("Maria",'f',151,200,49,19);

        paciente01.consomeKcaloria(95);
        paciente02.consomeKcaloria(34567000);
        paciente01.consomeKcaloria(931.5439002);
        paciente02.consomeKcaloria(5.7);
        paciente03.consomeKcaloria(340);
    }
}
