import java.util.Scanner;

public class dificil {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o seu salário: ");
        int s = scan.nextInt();
        double imposto = 0;
        if (s <= 1000) {
            System.out.println("0");
        } 
        if ((s > 1000) && (s <= 3000)){
            imposto = ((6.5/100) * s);
            System.out.println(imposto);
        }
        if ((s>3000) && (s<= 5000)) {
            imposto = ((9/100) * s);
            System.out.println(imposto);
        }
        if ((s>5000)) {
            imposto = ((12/100) * s);
            System.out.println(imposto);
        }
    }
    
}
