import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {
        double area, pi, raio;

        Scanner dado = new Scanner(System.in);

        System.out.print("Informe o valor do raio do círculo: ");
        raio = dado.nextDouble();

        area = 3.14159*Math.pow(raio,2);

        System.out.printf("%s%.4f","A área do círculo é igual a ",area);
    }
}
