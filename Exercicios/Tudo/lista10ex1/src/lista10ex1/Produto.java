package lista10ex1;

import java.math.BigDecimal;

public class Produto {
	private String nomeLoja;
	private BigDecimal preco;
	private String descricao;
	
	public Produto(String nomeLoja, BigDecimal preco) {
		this.nomeLoja = nomeLoja;
		this.preco = preco;
		this.descricao = "Produto de informática/livraria";
	}
	
	public String getDescricao(){
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNomeLoja() {
		return nomeLoja;
	}
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}
