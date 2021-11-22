package Calculadora;

public class CalcJava{

    private String soma, subtracao, divisao, multiplicacao, exponenciacao, raiz;

    
    public CalcJava(String soma, String subtracao, String divisao, String multiplicacao, String exponenciacao,
            String raiz) {
        this.soma = soma;
        this.subtracao = subtracao;
        this.divisao = divisao;
        this.multiplicacao = multiplicacao;
        this.exponenciacao = exponenciacao;
        this.raiz = raiz;
    }


    public String getSoma() {
        return soma;
    }


    public void setSoma(String soma) {
        this.soma = soma;
    }


    public String getSubtracao() {
        return subtracao;
    }


    public void setSubtracao(String subtracao) {
        this.subtracao = subtracao;
    }


    public String getDivisao() {
        return divisao;
    }


    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }


    public String getMultiplicacao() {
        return multiplicacao;
    }


    public void setMultiplicacao(String multiplicacao) {
        this.multiplicacao = multiplicacao;
    }


    public String getExponenciacao() {
        return exponenciacao;
    }


    public void setExponenciacao(String exponenciacao) {
        this.exponenciacao = exponenciacao;
    }


    public String getRaiz() {
        return raiz;
    }


    public void setRaiz(String raiz) {
        this.raiz = raiz;
    }


    @Override
    public String toString() {
        return "CalcJava [divisao=" + divisao + ", exponenciacao=" + exponenciacao + ", multiplicacao=" + multiplicacao
                + ", raiz=" + raiz + ", soma=" + soma + ", subtracao=" + subtracao + "]";
    }

    

    
}