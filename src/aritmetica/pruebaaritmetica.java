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
public class pruebaaritmetica {
    public static void main(String[] args){
       
        aritmetica a=new aritmetica(1,2);
int resultadosuma =a.sumar();
System.out.println("Resultado suma:"+resultadosuma);

aritmetica b=new aritmetica(1,2);
int resultadoresta=b.restar();
System.out.println("Resultado resta:"+resultadoresta);

aritmetica c=new aritmetica(1,2);
int resultadomultiplicar=c.multiplicar();
System.out.println("Resultado multiplicar:"+resultadomultiplicar);

aritmetica d=new aritmetica(4,2);
int resultadodividir=d.dividir();
System.out.println("Resultado dividir:"+resultadodividir);
    
  /* aritmetica b=new aritmetica();
int resultadoresta=b.restar(4,2);
System.out.println("Resultado resta:"+resultadoresta);

  aritmetica c=new aritmetica();
int resultadomultiplicar=c.multiplicar(4,2);
System.out.println("Resultado multiplicar:"+resultadomultiplicar);

 aritmetica d=new aritmetica();
int resultadodividir=d.dividir(4,2);
System.out.println("Resultado dividir:"+resultadodividir);*/
   }
}
