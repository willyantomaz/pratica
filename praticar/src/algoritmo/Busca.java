package algoritmo;



public class Busca {

    //public par apoder pegar esse metedo em qualqur lugar e static par an precisar instanciar a classe onde eu for usar esse metodo
    public static Integer binario(Integer[] lista, int busca) {
        int baixo = 0;
        int alto = lista.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;

            if (lista[meio].equals(busca)) {
                return meio;
            } else if (lista[meio] < busca) {
                baixo = meio + 1;
            } else if (lista[meio] > busca) {
                alto = meio - 1;
            } else {
                return null;
            }
        }
        return null;
    }

    public static Integer simples(Integer[] lista, int busca){

        int posicao = 0;

        while (lista[posicao] != busca){
            posicao++;
        }
        return posicao;
    }
}
