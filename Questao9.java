/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao9;

import java.util.Arrays;

/**
 *
 * @author Leonardo
 */
public class Questao9 {

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int j;
        int i;
        int matriz[][] = new int[m][n];
        
        for(i = 0; i < m; i++){
            for(j = i; j <= i; j++){
                matriz[i][j] = 1;
            }
        }
        System.out.println("Matriz");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
