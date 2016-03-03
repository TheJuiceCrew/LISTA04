package pkg6.lista_4;

import java.util.Scanner;


public class Lista_4 {

   
    public static void main(String[] args) 
    {
        nToT contador = new nToT();
        Scanner scan = new Scanner(System.in);
        int vetor[] = {0, 0, 0, 1, 1};
       
        
       
         //output;
       
        String output = contador.dezenaDeMilhar(vetor[0], vetor[1], vetor[2], vetor[3], vetor[4]) + contador.milhar(vetor[0], vetor[1], vetor[2], vetor[3], vetor[4]) + contador.centena(vetor[0], vetor[1], vetor[2], vetor[3], vetor[4]) + contador.dezena(vetor[0], vetor[1], vetor[2], vetor[3], vetor[4]) + contador.unidade(vetor[0], vetor[1], vetor[2], vetor[3], vetor[4]);
        System.out.println(output);
        
    }
}
