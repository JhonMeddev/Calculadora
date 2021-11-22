package Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Exponencial implements ICalcJava {
    
    Scanner kb = new Scanner(System.in);
    String x;
    double result;
    
    @Override
    public void fazerDivisao() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void fazerExponencial() {

        ArrayList<Double> exponencial = new ArrayList<>();
       
        do
        {
             System.out.println("insira um numero ou tecle '=' para fazer a EXPONENCIAÇÃO!: ");
             x = kb.next();
             if(x.equals("="))
             {
                 break;
             }
             else
             {
                 exponencial.add(Double.parseDouble(x));
             }
 
        }while(! x.equals("="));
        
        double num = exponencial.get(0);
        double exponente = exponencial.get(1);

        result = Math.pow(num, exponente);

        System.out.println("Exponencial dos numeros :" + exponencial.toString());
        System.out.println("e igual a: " + result);
        
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
        // TODO Auto-generated method stub
        
    }

    

}
