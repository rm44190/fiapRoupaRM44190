package br.com.fiap.loja;

/**
 *  MoedaEstrangeira. Classe responsável pelo tratamento da moeda americana
    @author Renata Hidalgo
 */
public class MoedaEstrangeira {

	/**
	 * Converter valor monetário de dolar para real.
	 *
	 * @param valor valor em dolar
	 * @return valor em real
	 */
	public int converterDolar(int valor){
		if (valor <0) return 0; 
		return valor*4;
		
	}
		
}
