package calculadora;

public class Calculadora {

    //metodo soma//
    public double somar(double a, double b) {
        return a + b;
    }
    //metodo subtração//
    public double subtrair(double a, double b) {
        return a - b;
    }
    //metodo multiplicação//
    public double multiplicar(double a, double b) {
        return a * b;
    }
    //metodo divisão//
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Erro: divisão por zero!");
        }
        return a / b;
    }
}
