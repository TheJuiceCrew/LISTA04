/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Questao2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 16;
        int vetorA[] = new int[n];
        int vetorB[] = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.println("-----------------");
            System.out.println("Digite o valor da posição "+ i);
            vetorA[i] = ler.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            vetorB[i+8] = vetorA[i];
        }
        for (int i = 0; i < 8; i++){
            vetorB[i] = vetorA[i+8];
        }
        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
        
    }
    
}
