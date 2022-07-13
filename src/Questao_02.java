import java.util.Scanner;

public class Questao_02 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double n1, n2, n3;
        double med;

        System.out.print("Informe a primeira nota do aluno: ");
        n1 = dado.nextDouble();
        System.out.print("Informe a segunda nota do aluno: ");
        n2 = dado.nextDouble();
        System.out.print("Informe a terceira nota do aluno: ");
        n3 = dado.nextDouble();

        med = (n1+n2+n3)/3;

        System.out.printf("%s%.2f","A média do aluno foi de ",med);
    }
}
