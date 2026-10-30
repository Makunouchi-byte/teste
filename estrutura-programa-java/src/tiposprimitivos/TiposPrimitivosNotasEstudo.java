package tiposprimitivos;

/* Estudo sobre tipos primitivos em Java */
public class TiposPrimitivosNotasEstudo {
    public static void main(String[] args) {
      // Caracteres ou Characters
      char primeiraLetraDoNome = 'R';
      char primeiraLetraDoNomeASCII = 82;
      
      System.out.println(primeiraLetraDoNome);
      System.out.println(primeiraLetraDoNomeASCII);

      // Tipos numéricos inteiros
      byte nota = 10; // -128 a 127
      short itensComprados = 2; //  -32.768 a 32.767
      int quantidadeEstoque = 23366; // -2.147.483.648 a 2.147.483.647
      long numeroMuitoGrande = 99999999999L; // -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

      // Tipos Decimais
      float peso = 1.5f; // 6-7 casas deciamis
      double preco = 24.99; // 15 casas decimais

      // Booleanos ou Booleans
      boolean verdadeiro = true;
      boolean falso = false;
    }
}
