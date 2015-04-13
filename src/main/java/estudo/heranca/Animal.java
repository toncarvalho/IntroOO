package estudo.heranca;

/*
Classe Abstrata Animal, esta classe utiliza a palavra reservada abstract,
portanto tratase de uma classe abstrata, ou seja, não pode jamais ser intanciada.
A utilização de seus atributos e métodos so pode ser obtida através da implementação de subclasses.
 */
public abstract class Animal {

    // atributos com o modificador de acesso protected, para permitir acesso aos atributos nas subclasses de Animal.
    protected String cor;
    protected String nome;


    /*
        assinatura de método abstrato, um método abstrado não tem corpo, na sua declaração.
        o corpo do método bem como sua responsabilidade é implementada nas subclasses envolvidas na hierarquia de classes desenvolvida.
     */
    public abstract void emitirSom();


    /*
    a seguir métodos acessores para os atributos da classe.
     */
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
