import estudo.beans.Pessoa;
import estudo.reflexao.EstudoReflexao;
import org.junit.Test;

/**
 * Created by ton on 17/03/15.
 */
public class TesteReflexao {

    @Test
    public void testeReflexao() {

        EstudoReflexao estudoReflexao = new EstudoReflexao();

        System.out.print(" nomes da classe Pessoa: ");

        estudoReflexao.descobreNome(new Pessoa());

        System.out.println(" Atributos e tipos de dados encontrados na classe Pessoa: ");

        estudoReflexao.descobreAtributos(new Pessoa());

        System.out.println(" Métodos encontrados: ") ;

        estudoReflexao.descobreMetodos(new Pessoa());


    }
}
