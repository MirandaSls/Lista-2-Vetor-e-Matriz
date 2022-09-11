
import java.util.Scanner;
import java.util.Random;

public class Ex1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        char []gabarito = new char[8];
        int [][]alunos = new int[10][9];
        int cont=0,h, passou=0;
        //Criando gabarito(escolha da pessoa)
        for(int i =0; i<8; i++){
            System.out.println("Digite a "+(i+1)+"Â° resposta do gabarito");
            gabarito[i] = entrada.next().charAt(0);
        }
        // criando numero(1-10) e respostas dos alunos(randomicamente)
        for(int i=0; i<10; i++) {
            alunos[i][0] = i+1;
        }

        for(int i=0; i<10; i++) {
            for(int j=1; j<9; j++) {
                alunos[i][j] = random.nextInt(65,69);
            }
        }

        System.out.println();
        //Imprimindo numero e respostas dos alunos
        for(int i=0; i<10; i++) {
            for(int j=0; j<9;j++) {
                if (j==0){
                    System.out.print(alunos[i][j]+" ");
                }
                else {
                    System.out.printf("%c",alunos[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println();
        //Imprimindo numero e quantidade de acertos dos alunos
        for(int i=0; i<10; i++) {
            if (cont>4) {
                passou++;
            }
            cont = 0;
            for(int j=1; j<9; j++) {
                h=0;
                if(alunos[i][j]==gabarito[h]) {
                    cont++;
                }
                h++;
            }
            System.out.println("o aluno "+alunos[i][0]+" obteve "+cont+" pontos na prova");
        }

        System.out.println();

        // Imprimindo a porcentagem de pessoas que passaram
        System.out.println("A porcentagem de alunos que passaram foi "+(passou*10)+"%");
        entrada.close();
    }
}