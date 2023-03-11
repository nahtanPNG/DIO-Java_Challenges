package edu.nathan.dio.desafios.basico;
import java.util.Scanner;
import java.lang.Math;

public class SomaH {
    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            h += (double)1/i;
        }
        System.out.println(Math.round(h));
    }
}