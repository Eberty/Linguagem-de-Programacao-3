public class Carro {
    public int ar, vidro, direcao, teto, roda, sensor;
    //deu cero sem precisar zerar
    public static int Nar, Nvidro, Ndirecao, Nteto, Nroda, Nsensor;
    
    public void instalaOpcional(String Aces_p_instalar){
        //NOTA: so posso adicionar um acessorio por carro, por isso tenho q verificar o nome informado e se eu ja coloqui ou nao
        if(Aces_p_instalar.equals("ar_condicionado") && this.ar == 0){
            this.ar++;
        }
        else if(Aces_p_instalar.equals("vidro_eletrico") && this.vidro == 0){
            this.vidro++;
        }
        else if(Aces_p_instalar.equals("direcao_hidraulica") && this.direcao == 0){
            this.direcao++;
        }
        else if(Aces_p_instalar.equals("teto_solar") && this.teto == 0){
            this.teto++;
        }
        else if(Aces_p_instalar.equals("roda_liga") && this.roda == 0){
            this.roda++;
        }
        else if(Aces_p_instalar.equals("sensor_estacionamento") && this.sensor == 0){
            this.sensor++;
        }
        else{
            System.out.println("O Acessorio " + Aces_p_instalar + ",que fora informado infelismente nao pode ser inserido!");
            return;
	}
        //ADICIONO A CONTABILIZACAO A TODOS OS CARROS
	contabilizaAcessorio(Aces_p_instalar);
    }
	
    public int getValor(){
        return 29000 + (this.ar * 1500) + (this.vidro * 600) + (this.direcao * 1150) + (this.teto * 4000) + (this.roda * 2850) + (this.sensor * 300);
    }
	
    private static void contabilizaAcessorio(String novoAcessorio){
    //nesse caso seria legal usar o swit mas eu nao sei ao certo como usar aqui
    	if(novoAcessorio.equals("ar_condicionado")){
            Nar++;
	}
        if(novoAcessorio.equals("vidro_eletrico")){
            Nvidro++;
	}
        if(novoAcessorio.equals("direcao_hidraulica")){
            Ndirecao++;
	}
        if(novoAcessorio.equals("teto_solar")){
            Nteto++;
	}
        if(novoAcessorio.equals("roda_liga")){
            Nroda++;
	}
        if(novoAcessorio.equals("sensor_estacionamento")){
            Nsensor++;
	}
    }
	
    public static void ImprimeStatico(){
	System.out.println("Numero de carros inseridos: " + Configurador.totalCarros());
	System.out.println("Orcameno: R$" + Configurador.valorTotal);
        System.out.println("\n\nCarros com Ar condicionado: " + Nar);
	System.out.println("Carros com Direcao hidraulica: " + Ndirecao);
	System.out.println("Carros com Carros com Teto solar: " + Nteto);
	System.out.println("Carros com Roda de liga: " + Nroda);
	System.out.println("Carros com Sensor de estacionamento " + Nsensor);
    }
}