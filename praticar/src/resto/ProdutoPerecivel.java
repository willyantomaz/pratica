package resto;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, String preco, Integer qtd, String dataValidade) {
        super(nome, preco, qtd);
        this.dataValidade = dataValidade;
    }


}
