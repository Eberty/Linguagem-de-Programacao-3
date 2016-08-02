package lista.pkg01.lp3;

// @author Eberty

//classe
public class Fracao{
    private int numerador, denominador;
    private Fracao res;
    private String str;
    
    //construtor: Nome da Classe
    public Fracao(int nume, int den){
        this.numerador = nume;
        if (den != 0){
            this.denominador = den;
        }else{
            System.out.println("Denominador Invalido, setaremos o denominador como 1");
            this.denominador = 1;
        }
    }

    public void mdc(){
        int r, x, y;
        x = numerador;
        y = denominador;
        
        while(y!=0){
            r = x%y;
            x = y;
            y = r;
        }
        
        numerador /= x;
        denominador /= x;
    }
    
    public Fracao soma (Fracao num){
        res = new Fracao (1,1);
        res.numerador = (this.numerador * num.denominador) + (num.numerador * this.denominador);
        res.denominador = (this.denominador * num.denominador);
        
        res.mdc();
        return res;
    }
 
    public Fracao subtracao (Fracao num){
        res = new Fracao (1,1);
        res.numerador = (this.numerador * num.denominador) - (num.numerador * this. denominador);
        res.denominador = (this.denominador * num.denominador);
        
        res.mdc();
        return res;
    }
    
    public Fracao produto (Fracao num){
        res = new Fracao (1,1);
        res.numerador = this.numerador * num.numerador;
        res.denominador = this.denominador * num.denominador;
        
        res.mdc();
        return res;
    }
    
    public Fracao divisao (Fracao num){
        res = new Fracao (1,1);
        res.numerador = this.numerador * num.denominador;
        res.denominador = this.denominador * num.numerador;
        
        res.mdc();
        return res;
    }  
 
    //converter para string
    public String toString (){
        str = this.numerador + "/" + this.denominador;
        return str;
    }
    
    //fazer
    int compara (Fracao num){
        double n1, n2;
        n1 = (double)this.numerador/(double)this.denominador;
        n2 = (double)num.numerador/(double)num.denominador;
        
        if(n1<n2)
            return -1;
        else
            if (n1>n2)
                return 1;
            else
                return 0;
    }
}