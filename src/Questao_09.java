import java.util.Scanner;

public class Questao_09 {
    public static void main(String[] args) {
        double b, alt, area;

        Scanner dado = new Scanner(System.in);

        System.out.print("Informe o tamanho da base do triângulo: ");
        b = dado.nextDouble();
        System.out.print("Informe a altura do triângulo: ");
        alt= dado.nextDouble();

        area = (b*alt)/2;

        System.out.printf("%s%.2f","A área do triângulo é igual a ",area);
    }
}
