package Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiplicacao implements ICalcJava{
    Scanner kb = new Scanner(System.in);
    String x;
    double multTotal;

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
        ArrayList<Double> multiplicacao = new ArrayList<>();
       
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
                 multiplicacao.add(Double.parseDouble(x));
             }
 
        }while(! x.equals("="));
        
        
        double multiplica=1;
        for(int i = 0 ; i < multiplicacao.size() ; i++)
        {
             multiplica *= multiplicacao.get(i);
            
         
        }
        System.out.println("subtracao dos numeros :" + multiplicacao.toString());
        System.out.println("e igual a: " + multiplica);
        
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
    
}
