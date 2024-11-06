import java.util.Arrays;
import java.util.Scanner;

import static algoritmo.Busca.*;
import static algoritmo.Ordenacao.*;

public class Main {
    public static void main(String[] args) {


       int opcao;
       do {
           Scanner scanner = new Scanner(System.in);
           //Criando uma lista desordenada
           Integer[]  lista = {12, 2, 3, 40, 5, 6, 7, 8, 9, 10,22, 12, 13, 14, 15, 1, 17, 18};

           System.out.println("Escolha qual programa vc quer testar: " +
                   "\n 1-> palindromo " +
                   "\n 2->menor elemento de uma lista" +
                   " \n 3-> maior elemento de uma lista" +
                   " \n 4->orderna lista(crescente)" +
                   " \n 5->ordernar lista(decresente)" +
                   "\n 6-> busca simples" +
                   "\n 7-> busca binaria"+
                   "\n 8-> sair");

           opcao = Integer.parseInt(scanner.nextLine());

           switch (opcao){

               case 1:
                   System.out.println("Escreva uma palavra: ");
                   String palavra = scanner.nextLine();
                   Palindromo.verificaPalavra(palavra);
                   break;

               case 2:
                   System.out.println("a nossa lista é essa: \n "+Arrays.toString(lista));
                   System.out.println("O menor elemento está na posição: "+pegarMenorElemento(lista));
                   break;

               case 3:
                   System.out.println("a nossa lista é essa: \n "+Arrays.toString(lista));
                   System.out.println("O maior elemento está na posição: "+pegarMaiorElemento(lista));
                   break;

               case 4:
                   System.out.println("a nossa lista é essa: \n "+Arrays.toString(lista));
                   System.out.println("A lista ordenada crescente é: \n "+Arrays.toString(ordenaListaMenor(lista)));
                   break;

               case 5:
                   System.out.println("a nossa lista é essa: \n "+Arrays.toString(lista));
                   System.out.println("A lista ordenada decrescente é: \n "+Arrays.toString(ordenaListaMaior(lista)));
                   break;
               case 6:
                   System.out.println("a nossa lista é essa: \n "+Arrays.toString(lista));
                   System.out.println("\n qual numero vc deseja buscar ?: ");
                   int busca = Integer.parseInt(scanner.nextLine());
                   System.out.println("O elemento está na posição: "+simples(lista,busca));
                   break;

               case 7:
                   System.out.println("a nossa lista é essa: \n "+Arrays.toString(ordenaListaMenor(lista)));
                   System.out.println("\n qual numero vc deseja buscar ?: ");
                   int buscaBinaria = Integer.parseInt(scanner.nextLine());
                   System.out.println("O elemento está na posição: "+binario(lista,buscaBinaria));
                   break;

               case 8:
                   System.exit(0);
                   break;
           }

       }while (true);
    }
}