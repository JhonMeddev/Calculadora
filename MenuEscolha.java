package Calculadora;

import java.util.Scanner;

public class MenuEscolha {
    
    Scanner kb = new Scanner(System.in);
    boolean keepGoing = true;

    public void menuEscolha()
    {
        
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
                sair();
            }

            else if(x.equals("subtracao"))
            {
                new Subtracao().fazerSubtracao();
                sair();
            }

            else if(x.equals("multiplicacao"))
            {
                new Multiplicacao().fazerMultiplica();
                sair();
            }
            else if(x.equals("divisao"))
            {
                new Divisao().fazerDivisao();
                sair();
            }
            else if(x.equals("potencia"))
            {
                new Exponencial().fazerExponencial();
                sair();
            }
            else if(x.equals("raiz"))
            {
                new Raiz().fazerRaiz();
                sair();
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

    public void sair()
    {
        System.out.println("Deseja sair ou continuar: 's' ou 'n' ");
                String yn = kb.next();
                if(yn.equals("s"))
                {
                    keepGoing = false;
                }
                else
                {
                    menuEscolha();
                }
    }
    
}
