package operadores;

public class OperadoresNotasEstudo {
  public static void main(String[] args) {
    int numero1 = 1;
    int numero2 = 2;
    int soma = numero1 + numero2;
    // System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + soma);

    int numero3 = 3;
    int numero4 = 4;
    int subtracao = numero4 - numero3;
    // System.out.println(subtracao);

    double numero5 = 2.5;
    double numero6 = 6;
    double multiplicacao = numero5 * numero6;
    // System.out.println(multiplicacao);

    int numero7 = 7;
    int numero71 = 71;
    int divisao = numero71 / numero7;
    // System.out.println(divisao);

    int modulo = numero71 % numero7;
    //System.out.println(modulo);

    int contador = 0;
    contador++;
    contador++; 
    // System.out.println(contador);
    contador--;
    contador--;
    // System.out.println(contador);

    double decimal1 = 1.0;
    double decimal2 = 2.0;
    boolean ehMaior = decimal2 > decimal1;
    //System.out.println(ehMaior);

    boolean ehMenor = decimal2 < decimal1;
    //System.out.println(ehMenor);

    //System.out.println(decimal1 >= decimal2);

    //System.out.println(decimal1 == decimal1);
    //System.out.println(decimal1 != decimal1);

    int variavel = 1;
    // variavel += 4;
    // variavel -= 1;
    // variavel *= 5;
    // variavel /= -1;
    // variavel %= 1;
    //System.out.println(variavel);

    int valor1 = 4;
    int valor2 = 2;
    boolean expressaoAnd = valor1 < 10 && valor2 < 10;
    //System.out.println(expressaoAnd);

    boolean espressaoOr = valor1 < 10 || valor2 < 10;
    //System.out.println(espressaoOr);
    
    boolean expressaoNegada = 2 < 1;
    System.out.println(!expressaoNegada);


  }  
}
