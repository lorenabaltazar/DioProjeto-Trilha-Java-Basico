public class TiposOperadores {

    //classe Operadores.java
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4);

//classe Operadores.java
   public static void main(String[] args) {

    String nomeCompleto = "LINGUAGEM" + "JAVA";

    System.out.println("->Concatenação:");


   System.out.println(nomeCompleto);

String concatenacao ="?"; 

   concatenacao = 1+1+1+"1";
         System.out.println(concatenacao);
   
   concatenacao = 1+"1"+1+1;
         System.out.println(concatenacao);

   concatenacao = 1+"1"+1+"1";
         System.out.println(concatenacao);
   
   concatenacao = "1"+1+1+1;
         System.out.println(concatenacao);

   concatenacao = "1"+(1+1+1);
         System.out.println(concatenacao);
   
   
//classe Operadores.java
    System.out.println("->Unário:");

    int numero = 5;
   System.out.println(- numero);

    int numero2 = 5;
    numero2 = - numero2;
    System.out.println(numero2);
    System.out.println(-numero2);

//repetição (número+1)
   int numero3 = 5;
   System.out.println("->Repetição:");
   System.out.println( ++ numero3);
   
//condicional
    System.out.println("->Boolean:");
    int a, b;

    a = 3;
    b = 6;
    String resultado = "";
    if (a==b)
         resultado = "true";
    else
         resultado = "false";

    //OU
    
    System.out.println(resultado);
         
    String resultado2 = a==b ?"true":"false";
    System.out.println(resultado2);

    boolean simNao = a == b;
    System.out.println("A é igual a B? " + simNao);

//Relacionais
    System.out.println("->Relacionais");
    int c = 4;
    int d = 7;

    if(c > d)
        System.out.println("C maior que D");

    if(c < d)
        System.out.println("C menor que D");

    if(c >= d)
        System.out.println("C maior ou igual que D");

    if(c <= d)
        System.out.println("C menor ou igual que D");

    if(c != d)
        System.out.println("C é diferente de D");


    String bsinha = "Bergsa";
    String tikuna = "Tikuna";

    if (bsinha.equals(tikuna))
         System.out.println("Bergsa é igual a tikuna");
    else
         System.out.println("Bergsa não é tikuna");


// Lógico
    System.out.println("->Lógicos");
    boolean condicao1 = true;
    boolean condicao2 = false;

    if (condicao1&&condicao2)
         System.out.println("As duas condições são verdadeiras.");
    if((condicao1||condicao2)&&(condicao1!=condicao2))
         System.out.println("Apenas umas das condições é verdadeira.");


}
}
