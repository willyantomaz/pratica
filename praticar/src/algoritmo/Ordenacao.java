package algoritmo;

import java.lang.reflect.Array;

public class Ordenacao {

    public static int pegarMaiorElemento(Integer[] elementos){
        int maiorElemento = elementos[0];
        int endereco = 0;
        for (int posicao = 0; posicao < elementos.length ; posicao++){
            int aux = elementos[posicao];
            if(aux>maiorElemento){
                maiorElemento = aux;
                endereco = posicao;

            }
        }

        return endereco;
    }

    public static int pegarMenorElemento(Integer[] elementos) {
        int menorElemento = elementos[0];
        int endereco = 0;
        for (int posicao = 0; posicao < elementos.length ; posicao++){
            int aux = elementos[posicao];
            if(aux<menorElemento){
                menorElemento = aux;
                endereco = posicao;
            }
        }
        return endereco;
    }

    public static Integer[] ordenaListaMaior(Integer[] elementos) {

        Integer[] listaMaiorOrdenada = new Integer[elementos.length];

        for (int posicao = 0; posicao < elementos.length ; posicao++) {
            int endereco = pegarMaiorElemento(elementos);
            Array.set(listaMaiorOrdenada, posicao, elementos[endereco]);
            elementos[endereco] = 0;
        }
        return listaMaiorOrdenada;
    }


    public static Integer[] ordenaListaMenor(Integer[] elementos) {

        Integer[] listaMenorOrdenada = new Integer[elementos.length];

        for (int posicao = 0; posicao < elementos.length; posicao++ ){
            int endereco = pegarMenorElemento(elementos);
            Array.set(listaMenorOrdenada,posicao,elementos[endereco]);
            elementos[endereco] = 100;
        }

        return listaMenorOrdenada;
    }
}
