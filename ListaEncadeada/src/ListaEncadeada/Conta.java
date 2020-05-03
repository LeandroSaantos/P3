package ListaEncadeada;

public class Conta {
	private int numero;
	private String nome;
	private Conta proximo;
	
	
	public Conta (int numero,String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Conta getProximo() {
		return proximo;
	}

	public void setProximo(Conta proximo) {
		this.proximo = proximo;
	}
}
