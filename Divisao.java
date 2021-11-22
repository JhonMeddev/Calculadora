package Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Divisao implements ICalcJava{

    @Override
    public void fazerDivisao() 
    {
        String x;
        Scanner kb = new Scanner(System.in);
        ArrayList<Double> divisao = new ArrayList<>();
       
       do
       {
            System.out.println("insira um numero ou tecle '=' para fazer a DIVISAO!: ");
            x = kb.next();
            if(x.equals("="))
            {
                break;
            }
            else
            {
                divisao.add(Double.parseDouble(x));
            }

       }while(! x.equals("="));
       
       double div1 = divisao.get(0);

       for(int i = 1 ; i < divisao.size() ; i++)
       {
            div1 /= divisao.get(i);
           
        
       }
       System.out.println("A divisao dos numeros :" + divisao.toString());
       System.out.println("e igual a: " + div1);

    }

    @Override
    public void fazerExponencial() {}

    @Override
    public void fazerMultiplica() {}

    @Override
    public void fazerRaiz() {}

    @Override
    public void fazerSoma() {}

    @Override
    public void fazerSubtracao() {}
    
}
