package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class triangleCheck {
    public static void main(String[] args) {
        triangle();

    }

    public static void triangle (){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the value of the first side? ");
        double side1 = scanner.nextDouble();

        System.out.print("What is the value of the second side? ");
        double side2 = scanner.nextDouble();

        System.out.print("What is the value of the third side?  ");
        double side3 = scanner.nextDouble();

            if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {

            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is equilateral.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The triangle is isosceles..");
            } else {
                System.out.println("The triangle is scalene.");
            }
        } else {
                  System.out.println("Error: It is not possible to form a triangle with this information!  ");
        }


    }
}



//20) Verificação de Triângulo:
//Escreva um programa que receba três valores que representam os lados de um triângulo e verifique se é possível formar um triângulo com eles.
//Se sim, determine se o triângulo é equilátero, isósceles ou escaleno.