package entradaDeDados;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // entrada de dados do teclado
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis para receber dados do teclado
        System.out.println("\nDigite um número inteiro, um double, um char, uma string, um float e um boolean: ");
        int n1 = sc.nextInt(); // lê um inteiro
        double n2 = sc.nextDouble(); // lê um double
        char ch = sc.next().charAt(0); // lê um char
        String s = sc.next(); // lê uma string
        float f = sc.nextFloat(); // lê um float
        boolean b = sc.nextBoolean(); // lê um boolean
        // obs: esses dados podem ser já inseridos na variavel ou lidos do teclado
        // ex:
        int n3 = 10;

        // exibindo os dados lidos
        System.out.println("\nDados lidos: ");
        System.out.println("Inteiro: " + n1 + "\nDouble: " + n2 + "\nChar: " + ch + "\nString: " + s + "\nFloat: " + f
                + "\nBoolean: " + b + "\nInteiro: " + n3);

        // fechando o scanner
        sc.close();
    }
}
