package Aula04.FOR.Exercicios;

public class ForNumerosQuatroEmQuatroEmPar {
    public static void main(String[] args) {
        numeropar();

    }

    public static void numeropar (){
        for (int i = -4; i<=4; i++){
            if (i % 2 == 0){
                System.out.println("numero par: " + i);
            }
        }
    }


}
