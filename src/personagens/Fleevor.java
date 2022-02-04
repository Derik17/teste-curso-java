package personagens;

import java.util.Objects;

public class Fleevor {

	private String nome;
	private String classe;
	private Integer id;
	
	public Fleevor () {}
	public Fleevor(String nome, String classe, Integer id) {

		this.nome = nome;
		this.classe = classe;
		this.id = id;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(classe, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fleevor other = (Fleevor) obj;
		return Objects.equals(classe, other.classe) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Fleevor [nome=" + nome + ", classe=" + classe + ", id=" + id + "]";
	}

}
