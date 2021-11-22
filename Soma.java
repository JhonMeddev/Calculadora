package Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Soma implements ICalcJava {

    String x;
    double somaTotal;
    Scanner kb = new Scanner(System.in);


    @Override
    public void fazerSoma() {
        
        ArrayList<Double> soma = new ArrayList<>();
       
       do
       {
            System.out.println("insira um numero ou tecle '=' para fazer a SOMA: ");
            x = kb.next();
            if(x.equals("="))
            {
                break;
            }
            else
            {
                soma.add(Double.parseDouble(x));
            }

       }while(! x.equals("="));
       
       double soma1 = soma.get(0);
       double adicao=0;
       for(int i = 1 ; i < soma.size() ; i++)
       {
            adicao += soma.get(i);
           
        
       }
       if(soma1 < 0)
       {
            somaTotal =  (adicao) + (soma1);
       }
       else{
            somaTotal = (soma1) + (adicao);
       }
       System.out.println("subtracao dos numeros :" + soma.toString());
       System.out.println("e igual a: " + somaTotal);
    
    }

    @Override
    public void fazerSubtracao() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fazerMultiplica() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fazerDivisao() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fazerExponencial() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fazerRaiz() {
        // TODO Auto-generated method stub
        
    }

    
    
}
