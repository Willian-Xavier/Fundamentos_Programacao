import java.util.Scanner;

public class Questao_04 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        double sal, nsal;

        System.out.print("Informe o salário do funcionário: ");
        sal = dado.nextDouble();

        nsal = sal+sal*25/100;

        System.out.printf("%s%.2f","O novo salário do funcionário é de R$",nsal);
    }
}
