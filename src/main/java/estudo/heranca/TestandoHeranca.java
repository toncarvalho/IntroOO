package estudo.heranca;

/**
 * Created by Ton on 13/04/2015.
 */
public class TestandoHeranca {

    public static  void main (String[] args) {

        // Declarando e intanciando um animal;
        Animal bicho = new Gato();
        // utilizando método acessor para atribuir valor ao atributo nome
        bicho.setNome("BOB");
        // utilizando método acessor para atribuir valor ao atributo Cor
        bicho.setCor("Amarelo");


        // invocando método da classe
        bicho.emitirSom();

        // utilizando método acessor para obter o valor de uma variável da classe e imprimindo no console.

        System.out.println(" o nome do bicho é: " +  bicho.getNome());

        //// Instanciando um outro animal.
        Animal outroBicho = new Cachorro();
        outroBicho.setNome("REX");
        outroBicho.setCor("Preto");
        outroBicho.emitirSom();

        // utilizando método acessor para obter o valor de uma variável da classe e imprimindo no console.

        System.out.println(" o nome do bicho é: " +  outroBicho.getNome());







    }
}
