package pontoFormat;

public class App {
    public static void main(String[] args) {
        // saltar uma linha
        System.out.println("Hello, World!");
        // dar um print sem saltar uma linha
        System.out.print("Hello, World!");
        // saltar uma linha
        System.out.println();
        System.out.println("\n");

        // usando %s, %d e %f
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.2;
        // printar com duas casas decimais e saltar uma linha á duas formas
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        System.out.println(String.format("%s tem %d anos e ganha R$ %.2f reais", nome, idade, renda));

    }
}
