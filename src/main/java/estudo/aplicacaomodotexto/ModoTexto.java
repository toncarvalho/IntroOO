package estudo.aplicacaomodotexto;


import estudo.calculadora.Calculadora;

import java.util.Scanner;

public class ModoTexto {
    
    public static void main( String[] args) {

        // declaraçao de um objeto da classe Scanner padrão para leitura de caracteres em console no java.
        Scanner scanner = new Scanner(System.in);
        
        // Emitindo mensagem ao usuário pedindo que informe dados.
        
        System.out.println(" por favor informe um número:") ;

        // obtendo caracteres informados pelo usuário.
        String valor1 = scanner.nextLine();

        System.out.println(" informe um segundo número:") ;

        String valor2 = scanner.nextLine();


        // emitindo mensagem informativa ao usuário
        System.out.println(" atenção os números informados serão utilizados para realizar operações matemáticas, os resultados serão exibidos no console");


        // convertendo caracteres informados pelo usuário no modo texto em valores numéricos.
        Double n1 = Double.parseDouble(valor1);
        Double n2 = Double.parseDouble(valor2);

        //Instanciando um objeto da classe calculadora, invocando seus métodos para realizar as operações.
        Calculadora calc = new Calculadora();

        calc.adicao(n1,n2);
        calc.subtracao(n1,n2);
        calc.multiplicacao(n1,n2);
        calc.divisao(n1,n2);






        
        
        
    }
}
