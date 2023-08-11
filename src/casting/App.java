package casting;

public class App {
    public static void main(String[] args) {
        // casting de int para double
        int a = 10;
        double b = (double) a;
        // printar com duas casas decimais e saltar uma linha
        System.out.printf("%.2f%n", b);
        // casting de double para int
        double c = 10.5;
        int d = (int) c;
        System.out.println(d);
    }
}
