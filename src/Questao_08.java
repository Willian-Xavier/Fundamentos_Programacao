import java.util.Scanner;

public class Questao_08 {
    public static void main(String[] args) {
        double valDep, porcTx, valRend, valTot;

        Scanner dado = new Scanner(System.in);

        System.out.print("Informe o valor do depósito: ");
        valDep = dado.nextDouble();
        System.out.print("Informe a porcentagem da taxa de juros: ");
        porcTx = dado.nextDouble();

        valRend = valDep*porcTx/100;
        valTot = valDep+valRend;

        System.out.printf("%s%.2f","O valor total do depósito mais o rendimento é de R$",valTot);
    }
}
