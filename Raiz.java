package Calculadora;
import java.util.Scanner;

public class Raiz implements ICalcJava
{
    Scanner kb = new Scanner(System.in);
    String x;

    @Override
    public void fazerRaiz() 
    {
        System.out.println("Insira um numero para extrair a RAIZ quadratica: ");
        x = kb.next();
        Double raiz = Math.sqrt(Double.parseDouble(x));
        System.out.println("A raiz do numero" + x + " e igual : " + raiz);
    }

    @Override
    public void fazerDivisao() {}

    @Override
    public void fazerExponencial() {}

    @Override
    public void fazerMultiplica() {}

    @Override
    public void fazerSoma() {}

    @Override
    public void fazerSubtracao() {}
    
}
