package com.fiap;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="p")

public class ProdutosBean {
	private int codProduto;
	private String descri��o;
	private String foto;
 	public String btnPesquisar(){
		if (getCodProduto() ==1){
			setDescri��o("Cal�a");
			setFoto("Calca.jpg");
		}else {
			setDescri��o("Blusa");
			setFoto("Blusa.jpg");
		}
	
				
		return "";
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
}
