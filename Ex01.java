import java.util.*;
public class Ex01 {
/*1. Faça um programa que leia uma sequência de 10 números reais e, ao final, imprima 
os números maiores do que a média. */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Declarando variáveis
    int[]vetorA = new int[10];
    int soma = 0;
    int media = 0;
    
    Random rd = new Random();

    for(int i = 0;i < vetorA.length;i++){
        vetorA[i] = rd.nextInt(101);
        soma += vetorA[i];
        media = soma /vetorA.length;
    }
    for(int i  = 0;i < vetorA.length; i++){    
    }
    System.out.println("media = " + media);

    for( int i =0;i<vetorA.length;i++){
        if(vetorA[i] > media){
            System.out.println("Maior que media: " + vetorA[i]);
        }
    }
    sc.close();
    
}
}
