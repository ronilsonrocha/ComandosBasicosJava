package virgula;

public class App {
    public static void main(String[] args) throws Exception {
        int n = 10;
        int[] vet = new int[n];
        for (int i = 0; i < n; i++) {
            vet[i] = i;
        }
        for (int i = 0; i < n; i++) {
            // dar um print no vetor com uma virgula para separar os elementos
            // exemplo 0,1,2,3,4
            System.out.print(vet[i]);
            // i aumenta de 1 em 1 e quando chegar em n - 1 ele para
            if (i < n - 1) {
                System.out.print(",");
            }
        }

    }
}
