import java.util.Scanner;

public class Questao_11 {
    public static void main(String[] args) {
        int num;
        //int num, nQuad, nCub, rQuad, rCub;

        Scanner dado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = dado.nextInt();

        /*
        nQuad = Math.pow(num, 2);
        //nCub = Math.pow(num, 3);
        //rQuad = Math.sqrt(num);
        rCub = Math.cbrt(num);
        */

        System.out.println("O número digitado ao quadrado é igual a: "+Math.pow(num, 2));
        System.out.println("O número digitado ao cubo é igual a: "+Math.pow(num, 3));
        System.out.println("A raiz quadrada do número digitado é "+Math.sqrt(num));
        System.out.println("A raiz cúbica do número digitado é igual a "+Math.cbrt(num));
    }
}
