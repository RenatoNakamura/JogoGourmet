package domain;

public class ArvoreBinaria {
	
	private NoArvoreBinaria raiz;
	
	public ArvoreBinaria(NoArvoreBinaria no){
		raiz = no;
	}
	
	public NoArvoreBinaria getRaiz(){
		return raiz;
	}
}
