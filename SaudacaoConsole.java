/* Testando programa de console com interação profissional */ 


import java.io.Console;


public class SaudacaoConsole {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Qual é o seu nome?");
    String nome = console.readLine();
    System.out.println("Olá, " + nome + "! Ainda sou bem novo, considere como se eu fosse um neném aprendendo a me comunicar, espero que esteja tudo bem com você.");
  }  
}
