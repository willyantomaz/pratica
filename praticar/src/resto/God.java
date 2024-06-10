package resto;

public class God {
    public static Human[] create(){
        //code
        Human[] humano = new Human[2];
        Woman woman = new Woman();
        Man man = new Man();
        woman.setNome("Eva");
        man.setNome("Adão");
        humano[0] = man;
        humano[1] = woman;

        return humano;
    }
}
class Human {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
class Woman extends Human{

}
class Man extends Human {

}