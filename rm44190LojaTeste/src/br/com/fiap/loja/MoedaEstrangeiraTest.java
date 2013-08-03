package br.com.fiap.loja;
//@author Renata Hidalgo
import static org.junit.Assert.*;

import org.junit.Test;

public class MoedaEstrangeiraTest extends MoedaEstrangeira {

	@Test
	public void testConverterDolarValorPositivo() {
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int valorReal = converter.converterDolar(5);
		assertEquals("Calcular Valor com 5 dolares",10,valorReal);
	}
	
	@Test
	public void testConverterDolarValorZerado() {
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int valorReal = converter.converterDolar(0);
		assertEquals("Calcular Valor para valores zerados",0,valorReal);
	}
	
	@Test
	public void testConverterDolarValorNegativo() {
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int valorReal = converter.converterDolar(-1);
		assertEquals("Calcular Valor para valores zerados",0,valorReal);
	}

}
