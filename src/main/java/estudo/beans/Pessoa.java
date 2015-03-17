package estudo.beans;

/**
 * Created by ton on 17/03/15.
 */
public class Pessoa {

    private Long idPessoa;

    private String nomePessoa;

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


    @Override
    public String toString() {
        return "Pessoa{" +
                "idPessoa=" + idPessoa +
                ", nomePessoa='" + nomePessoa + '\'' +
                '}';
    }


    private void andar (){
        System.out.println("andando!!!");

    }
}
