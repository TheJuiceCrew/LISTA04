/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao10;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Leonardo
 */
public class Questao10 {

    public static void main(String[] args) {
        Random ran = new Random();
        int m = 4;
        int n = 4;
        int matrizA[][] = new int[m][n];
        int matrizB[][] = new int[m][n];
        int matrizC[][] = new int[m][n];
        int i;
        int j;
        
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                matrizA[i][j] = ran.nextInt(10);
                matrizB[i][j] = ran.nextInt(10);
            }
        }
        System.out.println("Matriz 1 = " + Arrays.deepToString(matrizA));
        System.out.println("Matriz 2 = " + Arrays.deepToString(matrizB));
        
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                if (matrizA[i][j] > matrizB[i][j]){
                    matrizC[i][j] = matrizA[i][j]; 
                }
                else if(matrizA[i][j] < matrizB[i][j]) {
                    matrizC[i][j] = matrizB[i][j];
                }
                else;
            }
        }
        System.out.println("----------------------");
        System.out.println("Matriz 3");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.print(matrizC[i][j] + ",");
            }
            System.out.println("");
        }
    }
}
