import java.util.Scanner;

public class dificil2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a hora que o jogo começou: ");
        int hi = scan.nextInt();
        System.out.print("Informe os minutos que o jogo começou: ");
        int mi = scan.nextInt();
        System.out.print("Informe a hora que o jogo terminou: ");
        int hf = scan.nextInt();
        System.out.print("Informe os minutos que o jogo terminou: ");
        int mf = scan.nextInt();
        int dh = (hf - hi);
        int dm = (mf - mi);
        System.out.println("o jogo durou "+dh+" hora(s) e "+dm+" minuto(s)");
    }
    
}
