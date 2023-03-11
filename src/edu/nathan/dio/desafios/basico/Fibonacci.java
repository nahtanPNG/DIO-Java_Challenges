package edu.nathan.dio.desafios.basico;
import java.util.Scanner;

public class Fibonacci{

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int[] fibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0 ) {
                fibonacci[i] = 0;
            }else if (i == 1){
                fibonacci[i] = 1;
            }else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
