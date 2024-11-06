public class Palindromo {

    static void verificaPalavra(String palavra){

        palavra = palavra.toLowerCase().split(" ")[0];

        String palavraInvertida = invertePalavra(palavra);

        if(palavraInvertida.equals(palavra)){
            System.out.println("A palavra "+ palavra + " é um palindromo");
        }else {
            System.out.println("A palavra "+ palavra + " não é um palindromo");
        }

    }

     static String invertePalavra(String palavra){

        char[] letrasArray = palavra.toCharArray();
        String palavraInvertida = "";

        for (int x = letrasArray.length -1; x >= 0; x--){
            palavraInvertida = palavraInvertida.concat(String.valueOf(letrasArray[x]));

        }
        return palavraInvertida;
    }
}
