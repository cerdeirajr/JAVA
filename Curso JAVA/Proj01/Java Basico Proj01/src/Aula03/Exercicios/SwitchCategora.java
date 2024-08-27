package Aula03.Exercicios;

public class SwitchCategora {
    public static void main(String[] args) {

        switch (categoria){

            case 1:
                System.out.println("Criança");
                break;

            case 2:
                System.out.println("Adolecente");
                break;

            case 3:
                System.out.println("Adulto");
                break;

            case 4:
                System.out.println("Idoso");
                break;

            default:
                System.out.println("Categoria não Encontrada");
                break;

        }
    }
}
