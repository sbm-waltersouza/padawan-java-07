
public class Produto {

	private Integer id;
	private String nome;
	private String descricao;

	public Produto(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("O produto criado foi: %d, %s, %s", this.id, this.nome, this.descricao);
	}
	
}
