package variaveis;

/* Estudo sobre variáveis em Java */
public class VariaveisNotasEstudo {
  public static void main(String[] args) {
    // Declaração de variáveis representando a data atual.
    int dia = 27;
    int mes = 10;
    int ano = 2026;

    dia = 28; // Exemplo de atribuição de novo valor
    
    // Impressão da data no console.
    System.out.println(dia);
    System.out.println(mes);
    System.out.println(ano);
  }
  
  
public static void outroMetodo(String[] args) {  
    int dia = 29; // Variável local ao método outroMetodo
    System.out.println(dia);

}
}