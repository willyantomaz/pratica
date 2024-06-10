package resto;

public class Produto {

    private String nome;
    private String preco;
    private Integer qtd;

    public Produto(String nome, String preco, Integer qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Produto:"+nome+" preco:"+preco+" qtd:"+qtd;
    }
}
