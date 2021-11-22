package Calculadora;

import java.util.Scanner;

public class MenuEscolha {
    
    Scanner kb = new Scanner(System.in);

    public void menuEscolha()
    {
        boolean keepGoing = true;
        while(keepGoing)
        {
            System.out.println("Calculadora Simples");
            System.out.println("Qual das seguintes operacoes deseja realizar, digite 'sair' para encerrar");
            System.out.println("Adicao, \nSubtracao, \nMultiplicacao, \nDivisao, \nPotencia e \nRaiz");
            String x = kb.next().toLowerCase();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            if(x.equals("adicao"))
            {
                new Soma().fazerSoma();
            }

            else if(x.equals("subtracao"))
            {
                new Subtracao().fazerSubtracao();
            }

            else if(x.equals("multiplicacao"))
            {
                new Multiplicacao().fazerMultiplica();
            }
            else if(x.equals("divisao"))
            {
                new Divisao().fazerDivisao();
            }
            else if(x.equals("potencia"))
            {
                new Exponencial().fazerExponencial();
            }
            else if(x.equals("raiz"))
            {
                new Raiz().fazerRaiz();
            }
            else if(x.equals("sair"))
            {
                keepGoing = false;
            }
            else 
            {
                System.out.println("Opcao Invalida!");
                menuEscolha();
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

        }
    }
    
}
