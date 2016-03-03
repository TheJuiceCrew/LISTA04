/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao12;
import java.util.Arrays;
import java.util.Random;
        
/**
 *
 * @author Leonardo
 */
public class Questao12 {

    public static void main(String[] args) {
        Random ran = new Random();
        int m = 4;
        int n = 4;
        int MA[][] = new int [m][n];
        int i;
        int j;
        int aux;
        
        System.out.println("Matriz Original");
        for (i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                MA[i][j] = ran.nextInt(10);
                System.out.print(MA[i][j] + ",");
            }
            System.out.println("");
        }
        for (i = 0; i < 4; i++){
            aux = MA[0][i];
            MA[0][i] = MA [3][i];
            MA[3][i] = aux;
        }
        System.out.println("Matriz tranformada");
        for (i = 0; i < m; i++){
            for (j = 0; j < n; j++){
                System.out.print(MA[i][j] + ",");
            }
            System.out.println("");
        }
    }
}
