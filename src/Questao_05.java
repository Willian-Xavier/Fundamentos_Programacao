import java.util.Scanner;

public class Questao_05 {
    public static void main(String[] args) {
        double sal, perc, valAum, novoSal;

        Scanner dado = new Scanner(System.in);
        System.out.print("Informe o salário do funcionário: ");
        sal = dado.nextDouble();
        System.out.print("Informe o percentual de aumento do salário: ");
        perc = dado.nextDouble();

        valAum = sal*perc/100;
        novoSal = sal+valAum;

        System.out.printf("%s%.2f","O valor do aumento do salário foi de R$",valAum);
        System.out.printf("%n%s%.2f","O valor do novo salário com o aumento é de R$",novoSal);
    }
}
