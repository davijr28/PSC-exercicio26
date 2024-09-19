
import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int qntd = 20;
        int numeros[] = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < qntd - 1; i++) {
            for (int j = i + 1; j < qntd; j++) {
                if (numeros[j] < numeros[i]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        for (int i = 0; i < qntd; i++) {
            System.out.printf("Vetor %d: %d%n", i, numeros[i]);
        }
    }
}
