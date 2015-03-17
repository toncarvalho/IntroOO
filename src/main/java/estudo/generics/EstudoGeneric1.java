package estudo.generics;

/**
 * Created by ton on 10/03/15.
 */
public class EstudoGeneric1 {

    /**
     * Programação genérica.
     * <p/>
     * A programação  genérica é um paragidma de programação onde  o código é escrito de uma forma que pode se adaptar, utiliza
     * inferência de tipos para fornecer recursos extra de programação, pois um método pode ser escrito e ter seu tipo de retorno bem
     * como tipos de argumentos declarados, mas os tipos só serão realmente definidos na invocação, utilização dos métodos,
     * classes interfaces ou classes genéricas.
     *
     *
     * Este tipo de técnica pode ser útil em várias situações, o uso de programação genérica permite projetarmos e implementarmos
     * soluções amplamente reutilizáveis, pois com o nome ja indica estamos falando de algoritmos também genericos.
     * No desenvolvimento de soluções nos deparamos com a  necessidade de criar um código que possa executar uma mesa ação sobre tipos diferentes de objetos.
     * Normalmente qual a solução ?
     * Escrever classes diferentes para tratar cada tipo tipo de dados ( Objeto ) em separado, ou
     * criar mecanismos para identificar qual o tipo de dados que esta sendo passado como argumento ou esta instanciado e então
     * invocar métodos ou instanciar outros objetos e assim delegar  a estes a resolução do algoritmo.
     * Qualquer solução escolhida pode levar à duplicação de código em alguns trechos.
     *
     * É aí que a programação genérica aparece, pois quando o mesmo código serve para tratar objetos de mais de uma classe diferente, ou mais precisamente de uma
     * família de objetos, objetos que tem uma superclasse em comun por exemplo. Neste casso a escrita de código genérico vai muito bem.
     *
     * Vamos falar sobre alguns problemas comuns.
     *
     * Utilizando a linguagem java, temos o tipo Object do qual todas as classes java descendem. Sabendo disso podemos criar métodos com argumentos do tipo Object e
     * utiliza-los de forma genérica.
     * Mas na prática isto não é tão simples e torna o codigo um tanto quanto verboso, pois se faz necessário realizar conversões explícitas em vários pontos do código.
     * O uso de Casting, no trecho de codigo
     *
     * public void salvar(Object entidade){
     *
     *     daoCliente.persistir(entidade);
     * }
     *
     * o código compilaria pois o método salvar da classse DaoCliente espere como argumento um objeto do tipo Cliente, e estamos enviando um objeto do
     * tipo Object.
     *
     * Mas e agora ?
     * Podemos resolver o problema realizando a conversão explícita de tipos :
     *
     *
     *  public void salvar(Object entidade){
     *
     *      //cast
     *      Cliente novo = (Cliente ) entidade;
     *
     *     daoCliente.persistir(novo);
     * }
     *
     * O código acima realiza a conversão de um objeto do tipo entidade a um objeto do tipo Cliente, e funciona desde que sejam observadas alguns detalhes entre
     * a hierarquia de classes utilizada, caso contrário valores em atributos podem ser perdidos.
     *
     *
     *
     *
     */
    private void teste1() {


    }


}
