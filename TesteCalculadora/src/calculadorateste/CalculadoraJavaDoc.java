/**
 * Este código representa uma calculadora simples que pode realizar operações de soma,
 * subtração, multiplicação e divisão.
 */
package calculadorateste;

/**
 * A classe CalculadoraJavaDoc fornece métodos para executar as operações matemáticas.
 */
public class CalculadoraJavaDoc {

    /**
     * Esta função realiza a soma de dois números inteiros.
     *
     * @param a Simboliza o primeiro número a ser somado.
     * @param b Simboliza o segundo número a ser somado.
     * @return Retorna o resultado da soma de a e b.
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Esta função realiza a subtração de dois números inteiros.
     *
     * @param a Simboliza o número do qual o valor será subtraído.
     * @param b Simboliza o valor a ser subtraído de a.
     * @return Retorna o resultado da subtração de a por b.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Esta função realiza a multiplicação de dois números inteiros.
     *
     * @param a Simboliza o primeiro número a ser multiplicado.
     * @param b Simboliza o segundo número a ser multiplicado.
     * @return Retorna o resultado da multiplicação de a por b.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Esta função realiza a divisão de dois números inteiros.
     *
     * @param a Simboliza o número a ser dividido.
     * @param b Simboliza o número pelo qual a será dividido.
     * @return Retorna o resultado da divisão de a por b.
     * @throws ArithmeticException Se b for igual a 0, a tratatica deve ser dada pois na divisão,
     * o divisor jamais pode ser igual a 0.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
