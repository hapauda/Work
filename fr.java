import java.util.Scanner;

public class fr {
    public static void main(String[] args) {
        int y;
        int x;
        Scanner input  = new Scanner(System.in);
        System.out.println("coloque valor de y");
        y = input.nextInt();
        System.out.println("coloque valor de x");
        x = input.nextInt();
        int z = add(x,y);
        System.out.printf(" %d Here is the result: ",z);
        input.close();
        /*
         *%d	-Inteiro- decimal	System.out.printf("%d", 42); → 42
         *%f	Número de ponto -flutuante-	System.out.printf("%.2f", 3.14159); → 3.14
         *%s	-String-	System.out.printf("%s", "Olá!"); → Olá!
         *%c	-Caractere-	System.out.printf("%c", 'A'); → A
         *%n	-Nova linha- (igual a \n, mas portátil)	System.out.printf("Linha 1%nLinha 2"); → Nova linha
         *%x	-Inteiro em hexadecimal-	System.out.printf("%x", 255); → ff
         *%o	-Inteiro em octal-	System.out.printf("%o", 10); → 12
         *%%	-Imprime o caractere %-	System.out.printf("Taxa: 50%%"); → Taxa: 50%
         */

    }
    static int add(int x, int y){
        System.out.println("Fist method for change");
        int z  = x + y;
        return z ;
    }
}
