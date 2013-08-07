package com.fiap;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="p")

public class ProdutosBean {
	private int codProduto;
	private String descrição;
	private String foto;
 	public String btnPesquisar(){
		if (getCodProduto() ==1){
			setDescrição("Calça");
			setFoto("Calca.jpg");
		}else {
			setDescrição("Blusa");
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
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
}
