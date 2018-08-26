package lista10ex1;

import java.math.BigDecimal;

public class Livro extends Produto {
	private String autor;
	
	public Livro(String nomeLoja, BigDecimal preco, String autor, String descricao) {
		super(nomeLoja,preco);
		this.autor = autor;
		this.setDescricao(descricao);
	}
	
	@Override
	public String getDescricao() {
		return super.getDescricao()+" - "+this.autor;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
