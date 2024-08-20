package Aula02;

public class Produto {
    public static void main(String[] args) {
        String name = " celular ";
        double price = 300.00;
        boolean discount = false;

        if (discount) { price = price * 0.9;
            System.out.println("Preço com desconto:   " + price );
        }else {
            System.out.println("Preço sem cheio:  " + price);
        }


    }
}
