package ListaEncadeada;

public class ListaEncadeada {
	private int inseridos;
	private Conta inicio;
	
	public void addIndex(Conta c, int index) {
		if (inicio == null) {
			inicio = c;
		} else if (index < inseridos && c != null) {
			Conta ct = inicio;
			for (int i = 1; i < index - 1; i++) {
				ct = ct.getProximo();
			}
			c.setProximo(ct.getProximo());
			ct.setProximo(c);

		}
		inseridos++;
	}
	
	
	public void removeIndex(int index) {

		if (index < inseridos) {
			Conta temp = inicio;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.getProximo();
			}
			if(temp.getProximo()==null){
				temp.setProximo(null);
			}else{
				temp.setProximo(temp.getProximo().getProximo());
			}

		}
		inseridos--;

	}
	
	
	public int size() {
		return inseridos;
	}
	
	
	public void imprimeLista() {
		while(this.inicio != null) {
			System.out.println(this.inicio.getNome());
			this.inicio = this.inicio.getProximo();
		}
	}

}
