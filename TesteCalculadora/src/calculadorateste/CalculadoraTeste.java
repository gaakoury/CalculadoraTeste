

package calculadorateste;


public class CalculadoraTeste {
	public static void main(String[] args) {

		// TESTE DE SOMA
		Soma soma = new Soma();

		// teste de uma soma com dois números inteiros
		int resultsoma = soma.somar(1, 2);
		System.out.println(resultsoma);

		// teste de uma soma com um número inteiro e um zero
		resultsoma = soma.somar(1, 0);
		System.out.println(resultsoma);

		// teste de uma soma com dois zeros
		resultsoma = soma.somar(0, 0);
		System.out.println(resultsoma);

		// teste de uma soma com um número inteiro e um número negativo
		resultsoma = soma.somar(1, -5);
		System.out.println(resultsoma);

		// teste de uma soma com dois número negativos
		resultsoma = soma.somar(-1, -5);
		System.out.println(resultsoma);

		// teste de uma soma com um numero negativo e um zero
		resultsoma = soma.somar(-2, 0);
		System.out.println(resultsoma);

		// TESTE DE SUBTRAÇÃO
		Subtracao subtracao = new Subtracao();

		// teste de uma subtracao com dois números inteiros
		int resultsubtracao = subtracao.subtrair(1, 2);
		System.out.println(resultsubtracao);

		// teste de uma subtracao com um número inteiro e um zero
		resultsubtracao = subtracao.subtrair(1, 0);
		System.out.println(resultsubtracao);

		// teste de uma subtracao com dois zeros
		resultsubtracao = subtracao.subtrair(0, 0);
		System.out.println(resultsubtracao);

		// teste de uma subtracao com um número inteiro e um número negativo
		resultsubtracao = subtracao.subtrair(1, -5);
		System.out.println(resultsubtracao);

		// teste de uma subtracao com dois número negativos
		resultsubtracao = subtracao.subtrair(-1, -5);
		System.out.println(resultsubtracao);

		// teste de uma subtracao com um número negativo e um zero
		resultsubtracao = subtracao.subtrair(-2, 0);
		System.out.println(resultsubtracao);

		// TESTE DE MULTIPLICAÇÃO
		Multiplicacao multiplicacao = new Multiplicacao();

		// teste de uma multiplicacao com dois números inteiros
		int resultmultiplicacao = multiplicacao.multiplicar(1, 2);
		System.out.println(resultmultiplicacao);

		// teste de uma multiplicacao com um número inteiro e um zero
		resultmultiplicacao = multiplicacao.multiplicar(1, 0);
		System.out.println(resultmultiplicacao);

		// teste de uma multiplicacao com dois zeros
		resultmultiplicacao = multiplicacao.multiplicar(0, 0);
		System.out.println(resultmultiplicacao);

		// teste de uma multiplicacao com um número inteiro e um negativo
		resultmultiplicacao = multiplicacao.multiplicar(1, -5);
		System.out.println(resultmultiplicacao);

		// teste de uma multiplicacao com dois negativos
		resultmultiplicacao = multiplicacao.multiplicar(-1, -5);
		System.out.println(resultmultiplicacao);

		// teste de uma multiplicacao com um número negativo e um zero
		resultmultiplicacao = multiplicacao.multiplicar(-2, 0);
		System.out.println(resultmultiplicacao);

		// TESTE DE DIVISÃO
		Divisao divisao = new Divisao();

		// teste de uma divisao com dois números inteiros
		int resultdivisao = divisao.dividir(1, 2);
		System.out.println(resultdivisao);

		// teste de uma divisao com um número inteiro e um zero
		resultdivisao = divisao.dividir(0, 0);
		System.out.println(resultdivisao);

		// teste de uma divisao com dois zeros
		resultdivisao = divisao.dividir(0, 0);
		System.out.println(resultdivisao);

		// teste de uma divisao com um número inteiro e um negativo
		resultdivisao = divisao.dividir(1, -5);
		System.out.println(resultdivisao);

		// teste de uma divisao com dois negativos
		resultdivisao = divisao.dividir(-1, -5);
		System.out.println(resultdivisao);

		// teste de uma divisao com um número negativo e um zero
		resultdivisao = divisao.dividir(-2, 0);
		System.out.println(resultdivisao);

	}
}
