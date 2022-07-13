import java.util.Scanner;

public class Questao_03 {
    public static void main(String[] args) {
        double n1, n2, n3, med;
        int p1, p2, p3;

        Scanner dado = new Scanner(System.in);

        System.out.print("Informe a primeira nota do aluno: ");
        n1 = dado.nextDouble();
        System.out.print("Informe o peso da primeira nota do aluno: ");
        p1 = dado.nextInt();
        System.out.print("Informe a segunda nota do aluno: ");
        n2 = dado.nextDouble();
        System.out.print("Informe o peso da segunda nota do aluno: ");
        p2 = dado.nextInt();
        System.out.print("Informe a terceira nota do aluno: ");
        n3 = dado.nextDouble();
        System.out.print("Informe o peso da terceira nota do aluno: ");
        p3 = dado.nextInt();

        med = (n1*p1+n2*p2+n3*p3)/(p1+p2+p3);

        System.out.printf("%s%.2f","A média ponderada do aluno é de ",med);
    }
}
