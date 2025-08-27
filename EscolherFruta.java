import java.util.Scanner;

public class EscolherFruta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número (1 a 3): ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Você escolheu: Maçã");
                break;
            case 2:
                System.out.println("Você escolheu: Banana");
                break;
            case 3:
                System.out.println("Você escolheu: Laranja");
                break;
            default:
                System.out.println("Fruta inválida");
        }

        scanner.close();
    }
}
