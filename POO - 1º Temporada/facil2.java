import java.util.Scanner;

public class facil2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scan.next();
        System.out.println("Informe a primeira nota: ");
        int n1 = scan.nextInt();
        System.out.println("Informe a segunda nota: ");
        int n2 = scan.nextInt();
        System.out.println("Informe a terceira nota: ");
        int n3 = scan.nextInt();
        double media = ((n1 + n2 + n3) / 3.0);
        if (media >= 5) {
            System.out.println(nome+ " você foi aprovado(a) com média: "+ media);
        } else {
            System.out.println(nome+" você foi reprovado(a) com média: "+ media);
        }


    }
}
