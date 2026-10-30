import java.util.Scanner;

public class PrecoComDesconto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o preço original do produto: ");
    double precoOriginal = scanner.nextDouble();

    System.out.print("Digite a porcentagem de desconto (ex: 20 para 20%): ");
    double porcentagemDesconto = scanner.nextDouble();  
    
    double valorDesconto = precoOriginal * (porcentagemDesconto / 100);
    double precoComDesconto = precoOriginal - valorDesconto;
    System.out.printf("O preço com desconto é: R$ %.2f%n e o valor economizado foi: R$ %.2f", precoComDesconto, valorDesconto);
    
    scanner.close();
  }  
}
