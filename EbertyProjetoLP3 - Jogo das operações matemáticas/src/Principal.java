/**
 * Nome: Principal
 * Tipo: Classe Principal
 * Descrição: Classe de inicio de jogo que contem o método main().
 *            Responsável por ler a resposta do usuário e por imprimir as informações na linha de Comando.
 *            Obs.: Nenhuma outra classe pode ler ou imprimir na linha de comando.
 *                  A classe Principal deve solicitar uma instância de MotorDoJogo da classe BaseMotorDoJogo e não pode ter referencia diretas as implementações, apenas a interface.
 * 
 * Author: Eberty A.
 * Data: 20/Jul/2016
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {    
        int opcao;
        Scanner sc = new Scanner(System.in); //abre para leitura

        FonteDeExpressoes expressoes = new FonteDeExpressoes(); //ler do arquivo
        ArrayList<Expressao> listExp = expressoes.GetLista(); //lista de expressoes salvas na memoria ok
        Expressao exp; //vai receber as questoes de listExp

        MotorDoJogo ref; //instancia de motor do jogo solicitada
        BaseMotorDoJogo motor = new BaseMotorDoJogo(); //solicitacao de motor do jogo da clase base motor do jogo

        System.out.println("Bem vindo ao Jogo das operacões matemáticas!!!!\n"
                + "Utilise a linha de comando, as respostas pode conter valores decimais, favor utilize a virgula como divisor de casas.\n"
                + "Copyright Eberty Alves v1.0 \n\n");
        
        do{
            System.out.println("JOGO DAS OPERAÇÕES MATEMÁTICAS");
            System.out.println("1 - Ir para o Jogo");
            System.out.println("2 - Informações sobre o Jogo");
            System.out.println("3 - Sair");
            System.out.print("Você escolheu: ");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    Jogador jog = new Jogador(); //jogador do jogo
                    System.out.println("\nEscolha um modo de jogo: ");
                    System.out.println("1 - Modo Rapido");
                    System.out.println("2 - Modo treino");
                    System.out.println("3 - Modo Campanha");
                    System.out.print("Você escolheu: ");
                    do {
                        jog.setModoJogo(sc.nextInt());
                    } while (jog.getModoJogo() < 1 || jog.getModoJogo() > 3);

                    ref = motor.getMotorDoJogo(jog);

                    System.out.print("\n");

                    if (jog.getModoJogo() == 2 || jog.getModoJogo() == 3){ //quantos erros pode ter
                        System.out.print("Escolha a quantidade de erros pode cometer: ");
                        do {
                            jog.setqPodeErrar(sc.nextInt());
                        } while (jog.getqPodeErrar() < 0);
                    }

                    if (jog.getModoJogo() != 3) {
                        System.out.println("\nEscolha um Dificultador: ");
                        System.out.println("1 - Aleatorio");
                        System.out.println("2 - Nivel");
                        System.out.println("3 - Tipo");
                        System.out.println("4 - Nivel e Tipo");
                        System.out.print("Você escolheu: ");
                        do {
                            jog.setEscolheDif(sc.nextInt());
                        } while (jog.getEscolheDif() < 1 || jog.getEscolheDif() > 4);

                        if (jog.getEscolheDif() == 2 || jog.getEscolheDif() == 4) {
                            System.out.print("\nDigite o nível das questões: ");
                            jog.setNivelAtual(sc.nextInt());
                        }

                        if (jog.getEscolheDif() == 3 || jog.getEscolheDif() == 4) {
                            System.out.print("\nDigite o tipo de operacao das questões: ");
                            do {
                                jog.setOper(sc.next().charAt(0));
                            } while (jog.getOper()!= 's' && jog.getOper()!= 'd' && jog.getOper()!= 'a' && jog.getOper()!= 'm');
                        }

                        System.out.print("\nDeseja ver alguma informação antes de responder?[s/n] ");
                        do {
                            jog.setInformacao(sc.next().charAt(0));
                        } while (jog.getInformacao() != 's' && jog.getInformacao() != 'n'); //verificar se digitou correto

                        System.out.println("\nO jogo está prestes a começar\n"
                                + "O modo rapido aceita ate 20 questoes, acima disso o valor eh definido como 20\n"
                                + "O modo treino aceita quantas questoes o usuario digitar\n"
                                + "Valores negativos sao considerados como 0 questoes");
                        System.out.print("Digite a quantidade de questões: ");
                        ref.setqQuest(sc.nextInt());
                    } else {
                        jog.setEscolheDif(2);
                        jog.setNivelAtual(1);
                        jog.setInformacao('n');
                        System.out.println("Modo campanha sao 5 niveis de 12 questoes aleatorias cada, totalizando 60 questoes");
                        ref.setqQuest(60);
                    }

                    while (!ref.jogoAcabou(jog)) {
                        exp = ref.solicitarDif(jog).getExpressao(listExp);
                        
                        do{
                            System.out.println("\n" + ref.solicitarDif(jog).retornaInfo(exp, jog)); //informacao q escolhoi receber ou nao
                            System.out.print(exp.exibirExpressao()); //teste
                            jog.setResp(sc.nextDouble());

                            if (ref.acertou(exp, jog)) //nao pode fazer o repete e contar como 2 questoes
                                System.out.println("O jogador acertou!");
                            else
                                System.out.println("O jogador errou!");
                        } while(ref.repetir(jog) && !ref.jogoAcabou(jog)); //deseja repetir? alterar modo campanha
                        
                        if (ref.jogoDeFases()){
                            int aux = jog.getNivelAtual();
                            ref.passarFase(jog);
                            if (jog.getNivelAtual() != aux)
                                System.out.println("Você passou de nível\n");
                        }

                        System.out.print("Digite -1 para acabar com o jogo atual, digite qualquer outro valor inteiro para continuar jogando: ");
                        int conti = sc.nextInt();
                        if (conti == -1)
                            jog.setContinua(false);
                    }

                    //apresentar dados do jogador
                    System.out.println("\nFIM DE JOGO!");
                    System.out.println("O jogador terminou o atual jogo com " + jog.getqQuestResp() + " questões respondidas, de um total de " + ref.getqQuest() + " questões");
                    System.out.println("A quantidade de erros desse jogador foi: " + jog.getErros());
                    double calculo = ((jog.getqQuestResp() - jog.getErros()) / (double)ref.getqQuest()) * 100.0;
                    System.out.println("Com um total de " + jog.getPontos() + " pontos, o percentual de acerto em relacão ao numero de questoes disponiveis foi de: " + calculo + "% \n\n");
                    
                    break;
                    
                case 2:
                    System.out.println("É bastante simples jogar!!! Dada uma expressão matemática ao jogador, ele precisa tentar adivinhar a resposta correta.");
                    System.out.println("\nExistem vários modos de jogo, a escolha fica por conta do jogador:");
                    System.out.println("    Modo Rapido - Maximo de 20 questoes podendo errar até 3 questoes");
                    System.out.println("    Modo treino - Não há limite para quantidade de questoes, e o jogador escolhe a quantidade de erros q pode cometer");
                    System.out.println("    Modo Campanha - 5 niveis de 12 questoes cada, você consegue completar os 5 niveis sem perder?");
                    System.out.println("\nInformações sobre os Dificultadores:");
                    System.out.println("    Dificultador Aleatório: Seleciona expressões aleatórias do do nosso banco de dados");
                    System.out.println("    Dificultador de Nível: Seleciona expressões aleatórias baseadas no nível de dificuldade(1 a 5)");
                    System.out.println("    Dificultador de Tipo: Seleciona expressões aleatórias baseadas no tipo de operação(a - adição, s - subtração, m - multiplicação, d - divisão)");
                    System.out.println("    Dificultador de Nível e Tipo: É a união dos dois anteriores.\n\n");
                    break;
                    
                case 3:
                    System.out.println("Obrigado por utilizar este software.\n");
                    break;
                    
                default:
                    System.out.println("Opção inválida!\n");
            }
        } while (opcao != 3);
        sc.close();
    }
}
