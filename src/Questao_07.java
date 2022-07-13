import java.util.Scanner;

public class Questao_07 {
    public static void main(String[] args) {
        double salBase, salRec, descImp;

        Scanner dado = new Scanner(System.in);

        System.out.print("Informe o salário base do funcionário: ");
        salBase = dado.nextDouble();

        descImp = salBase*10/100;
        salRec = salBase+50-descImp;

        System.out.printf("%s%.2f","O valor do salário a receber é de R$",salRec);
    }
}
