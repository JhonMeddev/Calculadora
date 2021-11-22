package Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Subtracao implements ICalcJava
{
    String x;
    double subTotal;
    Scanner kb = new Scanner(System.in);

    @Override
    public void fazerDivisao() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fazerExponencial() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fazerMultiplica() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fazerRaiz() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fazerSoma() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fazerSubtracao() {
       ArrayList<Double> sub = new ArrayList<>();
       
       do
       {
            System.out.println("insira um numero ou tecle '=' para fazer a SUBTRAÇÃO!: ");
            x = kb.next();
            if(x.equals("="))
            {
                break;
            }
            else
            {
                sub.add(Double.parseDouble(x));
            }

       }while(! x.equals("="));
       
       double sub1 = sub.get(0);
       double subtra=0;
       for(int i = 1 ; i < sub.size() ; i++)
       {
            subtra += sub.get(i);
           
        
       }
       if(sub1 < 0)
       {
            subTotal =  (subtra) + (sub1);
       }
       else{
            subTotal = (sub1) - (subtra);
       }
       System.out.println("subtracao dos numeros :" + sub.toString());
       System.out.println("e igual a: " + subTotal);
    }
    
}