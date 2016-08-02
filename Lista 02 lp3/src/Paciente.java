/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eberty
 */
public class Paciente{
    String nome;
    char sexo;
    int idade;
    double altura, calorias, peso;
   
    //construtor
    public Paciente(String nome, char sexo, double altura, double calorias, double peso, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.calorias = calorias;    
    }
       
    double calculaKcaloria(){
        double qtdcal = 0;
        if(this.sexo == 'm' || this.sexo == 'M'){
           qtdcal = 66.437 + (5.0033 * this.altura) + (13.7516 * this.peso) - (6.755 * this.idade);
        }
        else if(this.sexo == 'f' || this.sexo == 'F'){
           qtdcal = 655.0955+(1.8496 * this.altura)+(9.5634 * this.peso)-(4.6756 * this.idade);
        }
        return qtdcal;
    }
    
    void consomeKcaloria(double cal){
        double kcal = calculaKcaloria();
        if(this.calorias + cal <= kcal){
            this.calorias = this.calorias + cal;
            System.out.println (this.nome + ": Calorias ingeridas com sucesso,faltam " + (kcal-this.calorias) + " calorias para atingir o limite diário permitido de " + kcal + " calorias\n");   
        }
        else
            System.out.println (this.nome + ": Não é mais permitido ingerir calorias, " + this.calorias + " calorias consumidas de um total de " + kcal + " calorias permitidas\n");
    }
}