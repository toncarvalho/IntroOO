package estudo.reflexao;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by ton on 17/03/15.
 */
public class EstudoReflexao {

    public void descobreNome(Object objeto) {


        //descobrindo  o nome da classe, tipo
        String nome = objeto.getClass().getName();
        String nomeCanonico = objeto.getClass().getCanonicalName();
        String nomeSimples = objeto.getClass().getSimpleName();


        System.out.println(" nome: " + nome + " nome canonico: " + nomeCanonico + " nome simples: " + nomeSimples);


    }


    public void descobreAtributos(Object objeto) {

        Field[] fields = objeto.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            System.out.println(" campo: " + fields[i].getName() + " tipo de dados: " + fields[i].getType().getTypeName());
        }


    }

    public void descobreMetodos(Object objeto) {

        Method[] methods = objeto.getClass().getDeclaredMethods();

        for (int i = 0; i < methods.length; i++) {

            System.out.println(" Método: " + methods[i].getName() + " retorno: " + methods[i].getReturnType().getSimpleName());


            Parameter[] argumentos = methods[i].getParameters();


            for (int j = 0; j < argumentos.length; j++) {

                System.out.println("--> argumento: " + argumentos[j].getName() + " tipo: " + argumentos[j].getType());

                argumentos[j].getParameterizedType().getTypeName() ;


            }




        }

    }


}
