import estudo.beans.Pessoa;
import estudo.beans.Produto;
import estudo.generics.DaoGenerico;
import jdk.nashorn.internal.objects.NativeArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ton on 12/04/2015.
 */
public class TesteGenerics {

    @Test
    public void testeDaoGenerico() {

        DaoGenerico<Pessoa> daoCliente = new DaoGenerico<Pessoa>();

        Pessoa cli = new Pessoa();
        cli.setIdPessoa(1l);
        cli.setNomePessoa("jose");

        daoCliente.salvar(cli);


        DaoGenerico<Produto> daoPF = new DaoGenerico<Produto>();
        Produto produto = new Produto();
        produto.setIdProduto(0l);
        produto.setDescricaoProduto(" Capa da invisibilidade");
        produto.setNomeFabricanteProduto("Azkabam");

        daoPF.salvar(produto);

    }

    @Test
    public void testListaGenerica() {

        //lista sem o uso de generics
        List lista = new ArrayList();
        lista.add(new Pessoa("José"));
        lista.add(new Pessoa("Maria"));
        lista.add(new Pessoa("André"));
        lista.add(new Pessoa("Mara"));

        lista.add(3312312);

        // note que é necessário o uso de instanceOf bem como cast explicito para utilização dos itens da lista.
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Pessoa) {
                Pessoa pf = (Pessoa) lista.get(i);
                System.out.println(pf.getNomePessoa());
            }
        }



        /* observe agora a mesma Lista mas, implementada com o uso de programação genérica, não é necessário cast
        pois a máquina virtual java ja sabera qual é o tipo, em tempo de execução*/

        List<Pessoa> pessoasComGenerics =  new ArrayList<Pessoa>();
        pessoasComGenerics.add(new Pessoa("José"));
        pessoasComGenerics.add(new Pessoa("Maria"));
        pessoasComGenerics.add(new Pessoa("André"));
        pessoasComGenerics.add(new Pessoa("Mara"));

        for( Pessoa p: pessoasComGenerics ) {
            System.out.println(p);

        }


    }
}
