package br.com.fiap.loja;

import java.util.Scanner;


public class LojaFreeShop {

	/**
	 * @param args
	 * @author Renata Hidalgo
	 */
	public static void main(String[] args) {
		MoedaEstrangeira converter = new MoedaEstrangeiraProxy();
		System.out.println("Digite o valor em Dolar:");

		try {
		
			Scanner teclado = new  Scanner (System.in);
			int valorDolar = teclado.nextInt();
			int valorReal =  converter.converterDolar(valorDolar);
			System.out.println("Valor em Real:" + valorReal );
		} catch (Exception e) {
		// TODO: handle exception
			System.out.println("Erro! Tenta mais tarde");
		}
	}
	
}
