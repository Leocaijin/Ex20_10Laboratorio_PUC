import java.util.Random;

class Ex02{
/*• Crie um programa que leia um vetor A de 10 valores e construa um vetor 
B, da seguinte forma: 
 
Ex.: Vetor A 3 8  7 12 ... 5 
Vetor B      9 4 21 6 ... 15  */

public static void main(String[] args) {
    
    int[]vetorA = new int[10];
    int[]vetorB = new int[vetorA.length];

    Random rd = new Random(21);

    for(int i = 0;i < vetorA.length;i++){
        vetorA[i] = rd.nextInt(21);

        if(  vetorA[i] % 2 == 0){
            vetorB[i] = vetorA[i]/2;
        }
        if(vetorA[i] % 2 != 0){
            vetorB[i] = vetorA[i] * 3;
        }
    }
    System.out.print("Vetor A " + " ");
        for(int i =0;i< vetorA.length;i++){
            System.out.print(vetorA[i] + "  ");
        }
        System.out.println();
        
    System.out.print("Vetor B " +" ");
    for( int j = 0;j < vetorB.length;j++){
        System.out.print(vetorB[j] + "  ");
    }

    }
}
