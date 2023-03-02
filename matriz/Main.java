package matriz;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("digite el numero de filas ");
        int filas = sc.nextInt();
        System.out.println("digite el numero de columnas ");
        int columnas = sc.nextInt();
        int matrix[][] = new int[filas][columnas];
        int sumatoria = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
                sumatoria += matrix[i][j];
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");	// Imprime elemento
            }
            System.out.println();	// Imprime salto de línea
        }
        System.out.println("la suma de todos los elemtos es: " + sumatoria);
    }
}
