package resto;

public class Moto extends Veiculo {
    private Integer cilindrada;

    public Integer getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void exibir(){
        System.out.println(getNome());
        System.out.println(getAno());
        System.out.println(getQtdRodas());
        System.out.println(getCilindrada());


    }
}
