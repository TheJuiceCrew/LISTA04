/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Leonardo
 */
public class Questao3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 20;
        int vetorA[] = new int[n];
        int X = 0;
        int i;
        int posicao = -1;
        boolean teste = true;
        System.out.println("Não repita os números");
        for (i = 0; i < n; i++){
            System.out.println("-----------------");
            System.out.println("digite a posição "+ i);
            vetorA[i] = ler.nextInt();
        }
        while (teste == true){
            System.out.println("O vetor A =" + Arrays.toString(vetorA));
            System.out.println("-------------------");
            System.out.println("Digite o número: ");
            System.out.println("-------------------"); 
            X = ler.nextInt();
            for (i = 0; i < n; i++){
                if (vetorA[i] == X){
                    posicao = i;
                    teste = false;
                }
            }
            if (posicao != -1){
            System.out.println("Número encontrado no vetor, na posicao: " + posicao);
            }
            else {
                System.out.println("Número não encontrado no vetor referente ao numero: " + X);
                System.out.println("Por favor, tente outra vez");
                System.out.println("-------------------");
            }
        }
    }
}
