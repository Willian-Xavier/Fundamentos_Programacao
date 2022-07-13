import java.util.Scanner;

public class Questao_06 {
    public static void main(String[] args) {
        double salBase, salRec, aumGrat, descImp;

        Scanner dado = new Scanner(System.in);
        System.out.print("Informe o valor do salário base do funcionário: ");
        salBase = dado.nextDouble();

        aumGrat = salBase*5/100;
        descImp = salBase*7/100;
        salRec = salBase+aumGrat-descImp;

        System.out.printf("%s%.2f","O valor do salário a receber é de R$",salRec);
    }
}
