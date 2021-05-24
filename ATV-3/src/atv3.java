/*Programe um método que receba como parâmetro um vetor de valores inteiros, 
e em seguida retorne esse arranjo na ordem inversa.
Exemplo:
int vetor1[] = { 3 , 9 , 4 , 6 , 7 };
int vetor2[] = organizaVetor(vetor1);
Neste caso, o retorno para a variável vetor2 deve ser: { 7 , 6 , 4 , 9 , 3 }
*/
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("A seguir digite o tamanho do vetor: ");
        int tma = read.nextInt();

        int[] array1 = new int[tma];
                
        for (int i = 0; i < array1.length; i++){
            System.out.println("Digite o número "+ (i + 1) + " do vetor!"); 
            array1[i] = read.nextInt();
        }
        int original = array1.length;
        int[] array2 = new int[original];
        int tamanhoVetorOriginalZeroBased = original - 1;
        System.out.println("Invertendo o vetor: ");

        for(int i = 0; i < original; i++) {
            array2[i] = array1[tamanhoVetorOriginalZeroBased - i];
            System.out.print(array2[i]+" ");
        }
        System.out.println(" ");
    }
}
