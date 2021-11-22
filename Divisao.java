package Calculadora;

import java.security.DigestInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Divisao implements ICalcJava{

    @Override
    public void fazerDivisao() 
    {
        String x;
        double divTotal;
        Scanner kb = new Scanner(System.in);
        ArrayList<Double> divisao = new ArrayList<>();
       
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
                divisao.add(Double.parseDouble(x));
            }

       }while(! x.equals("="));
       
       double div1 = divisao.get(0);
       double divi=0;
       for(int i = 0 ; i < divisao.size() ; i++)
       {
            divi += divisao.get(i);
           
        
       }
       if(div1 < 0)
       {
            System.out.println("Opcao Invalida");
            divTotal =0;
       }
       else{
            divTotal = (div1) / (divi);
       }
       System.out.println("subtracao dos numeros :" + divisao.toString());
       System.out.println("e igual a: " + divTotal);

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
