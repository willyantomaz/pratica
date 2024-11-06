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
        Integer[] lista = elementos.clone();

        for (int posicao = 0; posicao < lista.length; posicao++ ){
            int endereco = pegarMenorElemento(lista);
            Array.set(listaMenorOrdenada,posicao,lista[endereco]);
            lista[endereco] = 100;
        }

        return listaMenorOrdenada;
    }
    /*
        Pq ultilizar a função clone() ? se passar lista por referencia ele vai alterar os dados da lista, como assim ?
        se eu estou passando passando como paramentro n era para alterar só o paramentro,
        sim e não, quando passamos uma variavel como parametro realmente só vamos trocar o valor do parametro sem interferir no valor da variavel real,
        porem quando falamos de um array ou de uma lista não funciona bem assim,
        o array ele não armazena os numeros q eu coloquei mas sim o endereço de memoria deles,
        por exemplo o valor 12 está na posição A1 entaõ o array está guardando, lista = {A1},
        o endereço de memoria dele então quando passamos ele como parametro a lista real e a lista de referencia vão ter os mesmos valores,
        logo os mesmos endereços de memoria,
        então quando alteramos o endereço de memoria do parametro estamos alterando o valor no endereço armazenado por ele,
        trocando assim os valores da lista real.

     */
}
