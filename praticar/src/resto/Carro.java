package resto;

public class Carro extends Veiculo {

    private Integer precoAno1;
    private Integer precoAno2;
    private Integer precoAno3;


    public void setPrecos(Integer precoAno1, Integer precoAno2, Integer precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }


    public Integer maiorPreco() {

        if (precoAno1 > precoAno2 && precoAno1 > precoAno3) {
            return precoAno1;
        } else if (precoAno2 > precoAno3) {
            return precoAno2;
        } else {
            return precoAno3;
        }
    }

    public Integer menorPreco() {

        if (precoAno1 < precoAno2 && precoAno1 < precoAno3) {
            return precoAno1;
        } else if (precoAno2 < precoAno3) {
            return precoAno2;
        } else {
            return precoAno3;
        }
    }

    public void exibir() {
        System.out.println(getNome());
        System.out.println(getAno());
        System.out.println(getQtdRodas());
        System.out.println(" | " + precoAno1 + " | " + precoAno2 + " | " + precoAno3);
        System.out.println("menorPreco " + menorPreco());
        System.out.println("maiorPreco " + maiorPreco());
    }

}
