/**
 * @author Eberty
 */
public class Configurador {
    public static int valorTotal, quant;
    
    public static void adicionandoCarro(Carro car){
	quant++;		
	valorTotal += car.getValor();
    }

    public static int totalCarros(){
        return quant;
    }
}
