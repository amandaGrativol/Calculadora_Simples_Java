package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora Java");

        double a = lerNumero(sc, "Digite o primeiro número: ");
        char operador = lerOperador(sc);
        double b = lerNumero(sc, "Digite o segundo número: ");

        try {
            double resultado = switch (operador) {
                case '+' -> calc.somar(a, b);
                case '-' -> calc.subtrair(a, b);
                case '*' -> calc.multiplicar(a, b);
                case '/' -> calc.dividir(a, b);
                default -> throw new IllegalArgumentException("Operador inválido!");
            };

            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }

    private static double lerNumero(Scanner sc, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número válido.");
                sc.nextLine(); // limpa o buffer
            }
        }
    }

    private static char lerOperador(Scanner sc) {
        System.out.print("Digite o operador (+, -, *, /): ");
        return sc.next().charAt(0);
    }
}
