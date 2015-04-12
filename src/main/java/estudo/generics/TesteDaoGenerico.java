package estudo.generics;

import estudo.beans.Pessoa;
import estudo.beans.Produto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ton on 11/03/2015.
 */
public class TesteDaoGenerico {

    public static void main(String args[]) {

        DaoGenerico<Pessoa> daoCliente = new DaoGenerico<Pessoa>();

        Pessoa cli = new Pessoa();
        cli.setIdPessoa(1l);
        cli.setNomePessoa("jose");

        daoCliente.salvar(cli);


        DaoGenerico<Produto> daoPF = new DaoGenerico<Produto>();
        Produto produto= new Produto();
        produto.setIdProduto(0l);
        produto.setDescricaoProduto(" Capa da invisibilidade");
        produto.setNomeFabricanteProduto("Azkabam");

        daoPF.salvar(produto);

        testeDeListaGenerica();

    }


    public static void testeDeListaGenerica() {

        List lista = new ArrayList();
        lista.add(new Pessoa("José"));
        lista.add(new Pessoa("Maria"));
        lista.add(new Pessoa("André"));
        lista.add(new Pessoa("Mara"));

        lista.add(3312312);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Pessoa) {
                Pessoa pf = (Pessoa) lista.get(i);
                System.out.println(pf.getNomePessoa());
            }
        }












    }
}
