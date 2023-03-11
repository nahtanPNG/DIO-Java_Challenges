package edu.nathan.dio.desafios.basico;
import java.io.IOException;
import java.util.Scanner;

public class PositivoMedia {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;
        double somar = 0;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for (int i = 0; i < 6; i++) {
            x = leitor.nextDouble();
            if(x > 0) {
                cont++;
                somar += x;
            }
        }
        media = somar/cont;
        System.out.println( cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
