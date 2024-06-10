import java.util.Arrays;

import static algoritmo.Busca.binario;
import static algoritmo.Busca.simples;
import static algoritmo.Ordenacao.*;

public class Main {
    public static void main(String[] args) {

        //Criando uma lista desordenada
        Integer[]  lista = {12, 2, 3, 40, 5, 6, 7, 8, 9, 10,22, 12, 13, 14, 15, 1, 17, 18};

        //Criando uma lista que vai receber a lista ordenada crescente e decrescente
        Integer[] listaOrdenadaDecrescente;
        Integer[] listaOrdenadaCrescente;

        int maiorElemento;
        int menorElemento;

        maiorElemento = pegarMaiorElemento(lista);
        menorElemento = pegarMenorElemento(lista);

        /*
        Pq ultilizar a função clone() ? se passar lista por referencia ele vai alterar os dados da lista, como assim ?
        se eu estou passando passando como paramentro n era para alterar só o paramentro,
        sim e não, quando passamos uma variavel como parametro realmente só vamos trocar o valor do parametro sem interferir no valor da variavel real,
        porem quando falamos de um array ou de uma lista não funciona bem assim,
        o array ele não armazena os numeros q eu coloquei mas sim o endereço de memoria deles,
        por exemplo o valor 12 está na posição A1 entaõ o array está guardando, lista = {A1},
        o endereço de memoria dele então quando passamos ele como parametro a lista real e a lista de referencia vão ter os mesmos valroas,
        logo os mesmos endereços de memoria,
        então quando alteramos o endereço de memoria do parametro estamos alterando o valor no endereço armazenado por ele,
        trocando assim os valores da lista real.
         */

        listaOrdenadaDecrescente = ordenaListaMaior(lista.clone());

        listaOrdenadaCrescente = ordenaListaMenor(lista.clone());



        System.out.println(Arrays.toString(lista));

        System.out.println("posição do maior elemento: "+maiorElemento);

        System.out.println("posição do menor elemento: "+menorElemento);

        System.out.println(Arrays.toString(listaOrdenadaDecrescente));

        System.out.println(Arrays.toString(listaOrdenadaCrescente));

        System.out.println("Busca simples: "+simples(listaOrdenadaCrescente,1));

        //funcão para fazer um busaca binaria na lista crescente, passa como parametro a lista e o numero que está procurando
        System.out.println("Está na posição:"+binario(listaOrdenadaCrescente,9));

    }
}