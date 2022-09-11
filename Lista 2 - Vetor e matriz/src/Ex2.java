import java.util.Scanner;
import java.util.Random;
public class Ex2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        int M[][] = new int[3][4];
        int maior, menor, i, j, iMaior = 0, jMaior = 0, iMenor = 0, jMenor = 0;


        for (i = 0; i < M.length; i++) {
            for (j = 0; j <= M.length; j++) {
                M[i][j] = gerador.nextInt(999);
                System.out.print("(" + i + "," + j + ")" + M[i][j] + "| ");
            }
            System.out.printf("\n");
        }
        maior = M[0][0];
        menor = M[0][0];

        for (i = 0; i < M.length; i++) {
            for (j = 0; j <= M.length; j++) {
                if (M[i][j] > maior) {
                    maior = M[i][j];
                    iMaior = i;
                    jMaior = j;
                }
                if (M[i][j] < menor) {
                    menor = M[i][j];
                    iMenor = i;
                    jMenor = j;
                }
            }
        }

        System.out.println("O maior numero desta matriz e:" + maior);
        System.out.println("Sua posicao e: (" + iMaior + "," + jMaior + ")");
        System.out.println("O menor numero desta matriz e:" + menor);
        System.out.println("Sua posicao e: (" + iMenor + "," + jMenor + ")");

        entrada.close();

    }
}