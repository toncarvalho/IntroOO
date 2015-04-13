package estudo.calculadora;

/**
 * Created by Ton on 13/04/2015.
 */
public class Calculadora {


    public void adicao(Double v1, Double v2){
        Double x = v1 + v2;

        System.out.println(" o resultado da adição e: " + x);
    }


    public void subtracao(Double v1, Double v2){
        Double x = v1 - v2;

        System.out.println(" o resultado da subtração e: " + x);
    }

    public void multiplicacao(Double v1, Double v2){
        Double x = v1 * v2;

        System.out.println(" o resultado da Multiplicacao e: " + x);
    }

    public void divisao(Double v1, Double v2){
        Double x = v1 / v2;

        System.out.println(" o resultado da divisão e: " + x);
    }
}
