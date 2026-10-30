package string;
/* 
 * String: Uma sequência de caracteres.
 * Strings são usadas para representar texto em programas Java.
 * Elas podem ser manipuladas e processadas de várias maneiras.
 */

import java.util.Scanner;

public class StringNotasEstudo {
  public static void main(String[] args) {
    String texto = "Um texto para ser impresso";
    System.out.println(texto);

    Scanner scanner = new Scanner(System.in);
    // se quiser que apareça apenas o primeiro nome, troque o next line por next    
    System.out.println("Digite seu nome:");
    String nome = scanner.nextLine();
    System.out.println("Olá, " + nome + "!");

    scanner.close();

  }
}
