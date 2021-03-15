import java.util.Scanner;

public class medio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o nome do primeiro programador: ");
        String p1 = scan.next();
        System.out.print("Insira o salário do primeiro programador: ");
        int s1 = scan.nextInt();
        System.out.print("Insira o nome do segundo programador: ");
        String p2 = scan.next();
        System.out.print("Insira o salário do segundo programador: ");
        int s2 = scan.nextInt();
        if (s1 > s2) {
            System.out.println(p1);
        } else {
            System.out.println(p2);
        }
    }
    
}
