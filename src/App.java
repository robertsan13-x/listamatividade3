import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n1, n2, soma;
        System.out.println("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();
        soma = n1 + n2;
        System.out.print("O resultado é: " + soma);

        input.close();
    }
}
