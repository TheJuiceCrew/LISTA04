package pkg5.lista_4;

import java.util.Arrays;
import java.util.Scanner;


public class Lista_4 {

   
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[40];
        int vetor2[] = new int[40];
        System.out.println("Crie um novo vetor:");
        System.out.println("-------------------------");
        for (int i = 0; i < 40; i++)
        {
            System.out.println("Insira o item " + (i+1) + " do vetor");
            vetor[i] = scan.nextInt();  
            System.out.println("-------------------------");
        }
        
        int acumula;
        
        vetor2[0] = vetor[0];
        for (int i = 0; i < 39; i++)
        {
            vetor2[i+1] = vetor2[i] + vetor[i+1];
        }
       
        
        System.out.println(Arrays.toString(vetor));
         System.out.println(Arrays.toString(vetor2));
    }
    
}
