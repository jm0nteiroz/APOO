/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author a1923250
 */
public class Calculadora {

   
    private float resultado;
    public Calculadora( ){
     this.resultado=0; 
   
  }
    public Calculadora(float R){
       
        this.resultado = R ;
       
    }
   
    public void Adicao(float x){
    
        this.resultado =  this.resultado + x;
       
    }
    public void Subtracao(float x){
       
        this.resultado = this.resultado - x;
      
    }
    public void Multi(float x){
        this.resultado = this.resultado * x;
        
    }
    
    public void Divi(float x){
        if (x == 0){
            System.out.println("ERROR, Nao e possivel dividir por 0");
            }
        this.resultado = this.resultado / x;
    }
   
      public void imprimirR(){
    
        System.out.println(this.resultado);
}
    /* Metodo construtor
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Calculadora calc;
    calc = new Calculadora(10);
    calc.Adicao(10);
    calc.Subtracao(5);
    calc.Divi(2);
    calc.Multi(5);
    calc.imprimirR();
   
   
    }
   
}

