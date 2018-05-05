package domain;

public class NoArvoreBinaria {
	
	private NoArvoreBinaria noEsquerdo;
	private NoArvoreBinaria noDireito;
	private String valor;
	
	public NoArvoreBinaria(String valor){
		this.valor = valor;
	}
	
	public void setNoDireito(NoArvoreBinaria noDireito) {
		this.noDireito = noDireito;
	}

	public void setNoEsquerdo(NoArvoreBinaria noEsquedo){
		this.noEsquerdo = noEsquedo;
	}

	public NoArvoreBinaria getNoEsquerdo() {
		return noEsquerdo;
	}

	public NoArvoreBinaria getNoDireito() {
		return noDireito;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
