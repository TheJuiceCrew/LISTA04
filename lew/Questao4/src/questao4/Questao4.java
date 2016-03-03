/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Leonardo
 */
public class Questao4 {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner ler = new Scanner(System.in);
        int n = 40;
        int vetorA[] = new int [n];
        int i;
        int pares = 0;
        
        for (i = 0; i < n; i++){
            vetorA[i] = ran.nextInt(n);
        }
        System.out.println("-------------------");
        System.out.println(Arrays.toString(vetorA));
        
        for (i = 0; i < n; i++){
            if ((vetorA[i] % 2) == 0){
                pares++;
            }
        }
        System.out.println("-------------------");
        System.out.println("Números pares: "+ pares);
    }
    
}
