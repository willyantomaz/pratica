package resto;

public class Veiculo {

    private String nome;
    private Integer ano;
    private Integer qtdRodas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(Integer qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public void exibir(){
        System.out.println(getNome());
        System.out.println(getAno());
        System.out.println(getQtdRodas());


    }

}
