import java.util.Scanner;

public class EstoqueMedio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite a quantidade mínima: ");
    int quantidadeMinima = scanner.nextInt();
    System.out.print("Digite a quantidade máxima: ");
    int quantidadeMaxima = scanner.nextInt();
    
    int estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
    System.out.println("O estoque médio é de " + estoqueMedio + " unidades.");
    
    scanner.close();
  }  
}
