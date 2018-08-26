package lista10ex1;

import java.math.BigDecimal;

public class Mouse extends Produto {
	private String tipo;

	public Mouse(String nomeLoja, BigDecimal preco, String tipo, String descricao) {
		super(nomeLoja,preco);
		this.tipo = tipo;
		this.setDescricao(descricao);
	}
	
	@Override
	public String getDescricao() {
		return super.getDescricao()+" - "+this.tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
