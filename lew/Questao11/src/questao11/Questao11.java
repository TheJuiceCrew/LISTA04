/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao11;
import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Questao11 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m = 20;
        int n = 20;
        int matriz[][] = new int[m][n];
        int i;
        int j;
        int linha = -1;
        int coluna = -1;
        int X;
        boolean teste = true;
        
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.println("Por favor, não repita números :D");
                System.out.println("Digite o o número pertencente a linha "+ i + " e coluna " + j);
                matriz[i][j] = ler.nextInt();
                System.out.print(matriz[i][j] + ",");
            }
            System.out.println("");
        }
        
        while (teste == true){
            System.out.println("-------------------");
            System.out.println("Digite o número que você quer pesquisar");
            System.out.println("-------------------");
            X = ler.nextInt();
            for(i = 0; i < m; i++){
                for(j = 0; j < n; j++){
                    if (matriz[i][j] == X){
                        linha = i;
                        coluna = j;
                        teste = false;
                    }
                }
            }
        }
        if (linha != -1 && coluna != -1){
            System.out.println("-------------------");
            System.out.println("Número encontrado!");
            System.out.println("Localização: Linha = " + linha + " Coluna = " + coluna);
            System.out.println("-------------------");
        }
        else {
            System.out.println("-------------------");
            System.out.println("Número não encontrado!");
        }
    }
}
