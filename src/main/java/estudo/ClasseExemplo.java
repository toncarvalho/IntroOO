package estudo;

/**
 *
 * Temos ainda situações onde pode ser necessário em tempo de execução descobrir qual o tipo de objeto que esta sendo utilizado, como por exemplo o trecho de código abaixo:
 *
 *
 * public void salvar(Entidade entidade ){
 *
 *     if( entidade instanceof Cliente ){
 *         //código para persistir dados na tabela  de clientes
 *     }else if( entidade instanceof Forncededor){
 *         //codigo para persistir dados na tabela de Fornecedores.
 *     }
 *
 * }
 *
 * A utilização do paradigma de programação genérica possibilita a implementação de código para resolver o mesmo problema eliminado as
 * conversões explicitas e verificações de tipo em tipo de execução utilizando instanceof.
 *
 *
 * Para o uso de genéricos devemos conhecer o operador Diamond <>.
 *
 *
 *
 *
 */
public class ClasseExemplo {



}
