package calculadorateste;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class JunitTeste {

	@Test
	public void SomarDoisNumerosPositivos() {
		Soma calc = new Soma ();
		int soma = calc.somar(1, 2);
		Assert.assertEquals(3, soma);
		
	}
	@Test
	public void SomarUmNumeroPositivoEUmZero() {
		Soma calc = new Soma ();
		int soma = calc.somar(1, 0);
		Assert.assertEquals(1, soma);
		
	}
	@Test
	public void SomarDoisZeros() {
		Soma calc = new Soma ();
		int soma = calc.somar(0, 0);
		Assert.assertEquals(0, soma);
		
	}
	@Test
	public void SomarUmNumeroNegativoEUmPositivo() {
		Soma calc = new Soma ();
		int soma = calc.somar(-1, 2);
		Assert.assertEquals(1, soma);
		
	}
	@Test
	public void SomarDoisNumerosNegativos() {
		Soma calc = new Soma ();
		int soma = calc.somar(-1, -2);
		Assert.assertEquals(-3, soma);
		
	}
	@Test
	public void SomarUmNegativoEUmZero() {
		Soma calc = new Soma ();
		int soma = calc.somar(-2, 0);
		Assert.assertEquals(-2, soma);
		
	}
	
	@Test
	public void SubtrairDoisNumerosPositivos() {
		Subtracao calc = new Subtracao ();
		int subtracao = calc.subtrair(1, 2);
		Assert.assertEquals(-1, subtracao);
		
	}
	@Test
	public void SubtrairUmPositivosEUmZero() {
		Subtracao calc = new Subtracao ();
		int subtracao = calc.subtrair(2, 0);
		Assert.assertEquals(2, subtracao);
		
	}
	@Test
	public void SubtrairDoisZeros() {
		Subtracao calc = new Subtracao ();
		int subtracao = calc.subtrair(0, 0);
		Assert.assertEquals(0, subtracao);
		
	}
	@Test
	public void SubtrairUmPositivoEUmNegativo() {
		Subtracao calc = new Subtracao ();
		int subtracao = calc.subtrair(1, -2);
		Assert.assertEquals(3, subtracao);
		
	}
	@Test
	public void SubtrairDoisNumerosNegativos() {
		Subtracao calc = new Subtracao ();
		int subtracao = calc.subtrair(-1, -2);
		Assert.assertEquals(1, subtracao);
		
	}
	@Test
	public void SubtrairUmNegativoEUmZero() {
		Subtracao calc = new Subtracao ();
		int subtracao = calc.subtrair(-1, 0);
		Assert.assertEquals(-1, subtracao);
		
	}
	@Test
	public void MultiplicarDoisNumerosPositivos() {
		Multiplicacao calc = new Multiplicacao();
		int multiplicacao = calc.multiplicar(1, 2);
		Assert.assertEquals(2, multiplicacao);
		
	}
	@Test
	public void MultiplicarUmPositivoEUmZero() {
		Multiplicacao calc = new Multiplicacao();
		int multiplicacao = calc.multiplicar(1, 0);
		Assert.assertEquals(0, multiplicacao);
		
	}
	@Test
	public void MultiplicarDoisZeros() {
		Multiplicacao calc = new Multiplicacao();
		int multiplicacao = calc.multiplicar(0, 0);
		Assert.assertEquals(0, multiplicacao);
		
	}
	@Test
	public void MultiplicarUmPositivoEUmNegativo() {
		Multiplicacao calc = new Multiplicacao();
		int multiplicacao = calc.multiplicar(1, -2);
		Assert.assertEquals(-2, multiplicacao);
		
	}
	@Test
	public void MultiplicarDoisNegativos() {
		Multiplicacao calc = new Multiplicacao();
		int multiplicacao = calc.multiplicar(-1, -2);
		Assert.assertEquals(2, multiplicacao);
		
	}
	@Test
	public void MultiplicarUmNegativoEUmZero() {
		Multiplicacao calc = new Multiplicacao();
		int multiplicacao = calc.multiplicar(-1, 0);
		Assert.assertEquals(0, multiplicacao);
		
	}
	@Test
	public void DividirDoisNumerosPositivos() {
		Divisao calc = new Divisao();
		int divisao = calc.dividir(2, 1);
		Assert.assertEquals(2, divisao);
		
	}
	@Test
    public void DividirUmPositivoEUmZero() {
        Divisao calc = new Divisao();
        assertThrows(ArithmeticException.class, () -> {
        	calc.dividir(2, 0);
        });
	} 
	@Test
    public void DividirDoisZeros() {
        Divisao calc = new Divisao();
        assertThrows(ArithmeticException.class, () -> {
        	calc.dividir(0, 0);
        });
	}  
	@Test
	public void DividirUmPositivoEUmNegativo() {
		Divisao calc = new Divisao();
		int divisao = calc.dividir(2, -1);
		Assert.assertEquals(-2, divisao);
		
	}
	
	@Test
	public void DividirDoisNegativos() {
		Divisao calc = new Divisao();
		int divisao = calc.dividir(-2, -1);
		Assert.assertEquals(2, divisao);
		
	}
	@Test
    public void DividirUmNegativoEUmZero() {
        Divisao calc = new Divisao();
        assertThrows(ArithmeticException.class, () -> {
        	calc.dividir(-2, 0);
        });
	} 
	

}
