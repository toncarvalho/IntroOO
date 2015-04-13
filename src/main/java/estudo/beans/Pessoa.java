package estudo.beans;

/**
 * Classe java para representar uma pessoa
 */
public class Pessoa {
    // atributos da classe
    private Long idPessoa;

    private String nomePessoa;

   // métodos acessores.
    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }


    // construtor com argumento
    public Pessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    //construtor padrão
    public Pessoa() {
    }

    /*
    método sobrecrito.
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "idPessoa=" + idPessoa +
                ", nomePessoa='" + nomePessoa + '\'' +
                '}';

    }


    /*
    Método sem argumentos
     */
    public void andar (){
        System.out.println("andando!!!");

    }
}
