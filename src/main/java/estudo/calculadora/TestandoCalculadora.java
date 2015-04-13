package estudo.calculadora;


public class TestandoCalculadora {

    public static  void main(String[] args){

        //utilizando a classe calculadora, instanciação de um novo objeto
        Calculadora calc = new Calculadora();

        //invocando o método adição, e passando dois valores numéricos como argumentos de método.
        calc.adicao(10.00, 23.00);

        //invocando o método subtracao, e passando dois valores numéricos como argumentos de método.
        calc.subtracao(122.00, 23.00);

        //invocando o método divisao, e passando dois valores numéricos como argumentos de método.
        calc.divisao(210.00, 2.00);

        //invocando o método multiplicacao, e passando dois valores numéricos como argumentos de método.
        calc.multiplicacao(10.00, 2.00);

    }
}
