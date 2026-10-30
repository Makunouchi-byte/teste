import java.util.Scanner;

public class DiasDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Digite uma idade inteira válida.");
            scanner.close();
            return;
        }

        int anos = scanner.nextInt();
        scanner.close();

        if (anos < 0) {
            System.out.println("A idade não pode ser negativa.");
            return;
        }

        long dias = anos * 365L;
        System.out.printf("%d anos correspondem a %d dias (considerando 365 dias por ano).%n", anos, dias);
    }
}
