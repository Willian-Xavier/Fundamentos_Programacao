import java.util.Scanner;

public class Questao_12 {
    public static void main(String[] args) {
        int num1, num2;
        //double calc;

        Scanner dado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num1 = dado.nextInt();
        System.out.print("Informe outro número: ");
        num2 = dado.nextInt();

        //calc = Math.pow(num1, num2);

        System.out.println("O valor de "+num1+" elevado a "+num2+" é igual a "+Math.pow(num1, num2));
    }
}
