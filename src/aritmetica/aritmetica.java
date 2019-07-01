/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author labctr
 */
public class aritmetica {
    int a,b;//son atributos
    //creo constructor vacio
    aritmetica(){
        
    }
    // constructor con 2 argumentos
    aritmetica(int arg1,int arg2){
        a=arg1;
        b=arg2;
    }
     public int sumar(){
        return a+b;
    }
      public int restar(){
        return a-b;
    }
       public int dividir(){
        return a/b;
    }
        public int multiplicar(){
        return a*b;
    }
 /* public int sumar(int op1,int op2,int op3){
        return op1+op2+op3;
    }
   public int restar(int re1,int re2){
        return re1-re2;
    }
   public int multiplicar(int mu1,int mu2){
        return mu1*mu2;
    }
    public int dividir(int di1,int di2){
        return di1/di2;
    }*/
}
