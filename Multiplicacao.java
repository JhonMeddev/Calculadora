package Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiplicacao implements ICalcJava{
    
    String x;
    double multTotal;
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

        ArrayList<Double> mult = new ArrayList<>();
       
        do
        {
             System.out.println("insira um numero ou tecle '=' para fazer a MULTIPLICAÇÃO!: ");
             x = kb.next();
             if(x.equals("="))
             {
                 break;
             }
             else
             {
                 mult.add(Double.parseDouble(x));
             }
 
        }while(! x.equals("="));
        
        double mult1 = mult.get(0);
        double multiplicar=0;
        for(int i = 1 ; i < mult.size() ; i++)
        {
             multiplicar += mult.get(i);
            
        }

        multTotal = (mult1) * (multiplicar);

        }
        System.out.println("subtracao dos numeros :" + mult.toString());
        System.out.println("e igual a: " + multTotal);
        
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
        // TODO Auto-generated method stub
        
    } 

    
