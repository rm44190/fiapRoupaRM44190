package br.com.fiap.loja;

/**
 *  MoedaEstrangeira. Classe respons�vel pelo tratamento da moeda americana
    @author Renata Hidalgo
 */
public class MoedaEstrangeira {

	/**
	 * Converter valor monet�rio de dolar para real.
	 *
	 * @param valor valor em dolar
	 * @return valor em real
	 */
	public int converterDolar(int valor){
		if (valor <0) return 0; 
		return valor*4;
		
	}
		
}
