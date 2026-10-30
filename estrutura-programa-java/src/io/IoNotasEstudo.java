package io;

import java.util.Scanner;

/* 
 * I/O (Input/Output): Operações de entrada e saída de dados.
Entrada de dados (Input): Receber informações do usuário ou de outras fontes.
Saída de dados (Output): Exibir informações para o usuário ou enviar para outras fontes.    
 */
public class IoNotasEstudo {
  public static void main(String[] args) {
    //Leitura de dados de entrada
    System.out.println("Digite um número:");
    Scanner scanner = new Scanner(System.in);
    int valorDigitado = scanner.nextInt();
    System.out.println(valorDigitado);
    scanner.close();

    // Saída de dados
    System.out.printf("O número digitado foi %d", valorDigitado);
  }
  
}
