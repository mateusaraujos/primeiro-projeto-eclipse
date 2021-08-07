package app.testando;

import java.util.Objects;

public class Gato {

	private String nome;
	private String cor;
	private Integer idade;

	/**
	 * Construtor da classe.
	 * 
	 * @param nome
	 * @param cor
	 * @param idade
	 */
	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	/**
	 * Get de nome
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Set de nome
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Get de cor
	 * 
	 * @return
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * Set de cor
	 * 
	 * @param cor
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * Get de idade
	 * 
	 * @return
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * Set de idade
	 * 
	 * @param idade
	 */
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		// Se o toString() não for criado, quando System.out.println(gato); for chamador, aparecerá o endereço de memória.
		return "Gato [Nome = " + nome + ", Cor = " + cor + ", Idade = " + idade + "]";
	}

}
