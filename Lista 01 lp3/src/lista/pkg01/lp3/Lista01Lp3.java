package lista.pkg01.lp3;

//autor Eberty Alves

public class Lista01Lp3 {
    public static void main(String[] args) {
        Fracao fracao01 = new Fracao(2, 5);
        Fracao fracao02 = new Fracao(1, 4); 
        Fracao fracao03, fracao04, fracao05, fracao06;
        int comp;
        
        fracao03 = fracao01.soma(fracao02);
        fracao04 = fracao01.subtracao(fracao02);
        fracao05 = fracao01.produto(fracao02);
        fracao06 = fracao01.divisao(fracao02);
        
        System.out.println("Fracao 01: " + fracao01.toString());
        System.out.println("Fracao 02: " + fracao02.toString());
        System.out.println("Fracao 03: " + fracao03.toString());
        System.out.println("Fracao 04: " + fracao04.toString());
        System.out.println("Fracao 05: " + fracao05.toString());
        System.out.println("Fracao 06: " + fracao06.toString());

        comp = fracao03.compara(fracao01);
        if (comp == 1)
            System.out.println( fracao03.toString() + " > " + fracao01.toString());
        else if (comp == 0)
            System.out.println( fracao03.toString() + " = " + fracao01.toString());
        else
            System.out.println( fracao03.toString() + " < " + fracao01.toString());
    }   
}
