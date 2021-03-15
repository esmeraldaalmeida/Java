import java.util.Scanner;

public class medio{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a idade da primeira irmã: ");
        int idade1 = scan.nextInt(); 
        System.out.print("Informe a idade da segunda irmã: ");
        int idade2 = scan.nextInt();
        System.out.print("Informe a idade da terceira irmã: ");
        int idade3 = scan.nextInt();
        System.out.print("Informe a idade da quarta irmã: ");
        int idade4 = scan.nextInt();
        int soma = 0;
        if (idade1 > 15) {
            soma = soma + idade1;
        }
        if (idade2 > 15){
            soma = soma + idade2;
        }
        if (idade3 > 15){
            soma = soma + idade3;
        }
        if (idade4 > 15){
            soma = soma + idade4;
        }
        System.out.println("A soma das irmãs que tem mais de 15 é "+soma);
    }
}