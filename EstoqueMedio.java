/*
 * Faça um programa para calcular o estoque médio de uma peça, seguindo a fórmula:
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2
 * 
 * Ex: quantidadeMinima = 3, quantidadeMaxima = 7: O estoque médio é de 5 unidades.
 */
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
