import java.util.Scanner; //import java.util.Scanner;

public class facil1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int n1 = scan.nextInt();
        System.out.print("Insira o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.print("Insira o segundo número: ");
        int n2 = scan.nextInt();
        if (n1 % 2 == 0 )  {
            System.out.println(n1+" é par");
        } else {
            System.out.println(n1+ " não é par");
        }
        if (n2 % 2 == 0) {
            System.out.println(n2 + " é par");
        } else {
            System.out.println(n2+" não é par");
        }
    }
    

    
}
