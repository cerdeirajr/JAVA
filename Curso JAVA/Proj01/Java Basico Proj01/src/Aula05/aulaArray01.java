//Explicação de Arrays em Java
//Um array em Java é uma estrutura de dados que armazena múltiplos valores de um mesmo tipo em uma única variável. Um array tem tamanho fixo e armazena elementos de forma contínua na memória.
//
//Declaração de um Array
//Declaração e Inicialização:

package Aula05;

public class aulaArray01 {

    public static void main(String[] args) {
        int[] numeros = {10,20,30,40,50};

        for (int i = 0; i< numeros.length; i++) {
            System.out.println("Elemento no indice " +i + ":" + numeros[i]);
        }
    }

}
