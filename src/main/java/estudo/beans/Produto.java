package estudo.beans;

/**
 * Created by ton on 17/03/15.
 */
public class Produto {

    private Long idProduto;

    private String descricaoProduto;

    private String nomeFabricanteProduto;


    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFabricanteProduto() {
        return nomeFabricanteProduto;
    }

    public void setNomeFabricanteProduto(String nomeFabricanteProduto) {
        this.nomeFabricanteProduto = nomeFabricanteProduto;
    }
}
