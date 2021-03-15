import java.util.Scanner;

public class medio3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o nome do primeiro jogador: ");
        String j1 = scan.next();
        System.out.print("Insira o número de gols do primeiro jogador: ");
        int g1 = scan.nextInt();
        System.out.print("Insira o nome do terceiro jogador: ");
        String j2 = scan.next();
        System.out.print("Insira o número de gols do segundo jogador: ");
        int g2 = scan.nextInt();
        System.out.print("Insira o nome do terceiro jogador: ");
        String j3 = scan.next();
        System.out.print("Insira o número de gols do terceiro jogador: ");
        int g3 = scan.nextInt();
        if ((g1>g2) && (g1>g3)) {
            System.out.println(j1);
        }
        if ((g2>g1) && (g2>g3)) {
            System.out.println(j2);
        }
        if ((g3>g2) && (g3>g1)) {
            System.out.println(j3);
        }

    }
    
}