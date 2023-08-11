package string;

public class App {
    public static void main(String[] args) {
        // transformar int em string
        int n = 10;
        String s = Integer.toString(n);
        System.out.println(s);

        // transformar double em string
        double d = 10.5;
        String s1 = Double.toString(d);
        System.out.println(s1);

        // transformar string em int
        String s2 = "10";
        int n2 = Integer.parseInt(s2);
        System.out.println(n2);

        // transformar string em double
        String s3 = "10.5";
        double d2 = Double.parseDouble(s3);
        System.out.println(d2);

        // remover espaços em branco de uma string
        System.out.println();
        String s4 = "  Ronilson Rocha Santos  ";
        System.out.println(s4);
        System.out.println(s4.trim());

        // dividir uma string em um vetor de strings removendo os espaços em branco
        System.out.println();
        String s5 = " Ronilson, Jussara, Levi ";
        String[] vect = s5.trim().split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

        // substring
        System.out.println();
        String s6 = "Welcome!";
        // retorna a string a partir do indice informado
        System.out.println(s6.substring(0, 4));
        System.out.println(s6.substring(1, 6));

        // formatando cpf
        System.out.println();
        String cpf = "04795632101";
        String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-"
                + cpf.substring(9, 11);
        System.out.println(cpfFormatado);

    }
}
