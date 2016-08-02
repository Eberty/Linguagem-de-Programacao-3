/**
 * @author Eberty
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro1 = new Carro();
	Carro carro2 = new Carro();
	Carro carro3 = new Carro();
        Carro carro4 = new Carro();
	Carro carro5 = new Carro();
        
	carro1.instalaOpcional("Algo_novo");
        
        carro2.instalaOpcional("direcao_hidraulica");
	carro2.instalaOpcional("roda_liga");
	carro2.instalaOpcional("vidro_eletrico");
        
        carro3.instalaOpcional("direcao_hidraulica");
        carro3.instalaOpcional("ar_condicionado");
        
	carro4.instalaOpcional("ar_condicionado");
        carro4.instalaOpcional("vidro_eletrico");
	carro4.instalaOpcional("direcao_hidraulica");
        carro4.instalaOpcional("teto_solar");
	carro4.instalaOpcional("roda_liga");
        carro4.instalaOpcional("sensor_estacionamento");
        carro4.instalaOpcional("Capacidade_flutuar");
        
        // o carro 5 sera tradicional sem istalacoes opicionais
        
        //carros criados com sucesso
        //adicionar carros para contabilizar valor e qtd
	Configurador.adicionandoCarro(carro1);
        Configurador.adicionandoCarro(carro2);
	Configurador.adicionandoCarro(carro3);
	Configurador.adicionandoCarro(carro4);
        Configurador.adicionandoCarro(carro5);
		
	Carro.ImprimeStatico();
    }
}
