import java.util.Scanner;

public class ConversorDolarReal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o valor em dólares: ");
    double valorEmDolar = scanner.nextDouble();

    System.out.print("Digite a cotação do dólar: ");
    double cotacaoDolar = scanner.nextDouble();

    double valorEmReal = valorEmDolar * cotacaoDolar;
    System.out.printf("O valor em reais é: R$ %.2f%n", valorEmReal);
    
    scanner.close();
  }  
}
