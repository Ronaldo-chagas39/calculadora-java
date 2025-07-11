import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado = 0;

        switch (op) {
            case '+': resultado = n1 + n2; break;
            case '-': resultado = n1 - n2; break;
            case '*': resultado = n1 * n2; break;
            case '/': 
                if (n2 != 0) resultado = n1 / n2;
                else System.out.println("Não pode dividir por zero.");
                break;
            default: System.out.println("Operação inválida.");
        }

        System.out.println("Resultado: " + resultado);
    }
}
