package PilhaEncadeada;

public class PilhaEncadeada {
	private Conta inicio;
	private int posicao;
	
	public void push(Conta conta) {
		if(this.inicio == null) {
			this.inicio = conta;
		}else {
			Conta temp = this.inicio;
			while(temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(conta);
		}
		posicao++;
	}
	
	public int pop() {
		Conta temp = this.inicio;
		if(posicao == 0) {
			throw new NullPointerException();
		}else {
			while(temp.getProximo().getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(null);
			posicao--;
		}
		return temp.getNumero();
	}
	
	public Object peek() {
		Conta temp = this.inicio;
		while(temp.getProximo() != null) {
			temp = temp.getProximo();
		}
		return temp.getNumero();
	}
	

}
