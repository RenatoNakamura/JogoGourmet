package domain;

import interfaces.Game;
import interfaces.UserMessanger;

public class GameGourmet implements Game {
	
	private ArvoreBinaria arvore;
	private UserMessanger messanger;
	
	public GameGourmet(UserMessanger messanger){
		this.messanger = messanger;
		arvore = new ArvoreBinaria(new NoArvoreBinaria("massa"));
		arvore.getRaiz().setNoEsquerdo(new NoArvoreBinaria("Lasanha"));
		arvore.getRaiz().setNoDireito(new NoArvoreBinaria("Bolo de Chocolate"));
	}
	
	public void executar(){
		boolean fecharAplicativo = false;
		
		do {
			fecharAplicativo = messanger.informarInicio("Pense em um prato que gosta", "Jogo Gourmet");
			
			if(!fecharAplicativo){
				boolean resposta = messanger.perguntar("O prato que você pensou é "+ arvore.getRaiz().getValor() +"?", "Confirm");
				NoArvoreBinaria no = (!resposta ? arvore.getRaiz().getNoDireito() : arvore.getRaiz().getNoEsquerdo());
				
				adivinharPrato(no);			
			}
			
		} while (!fecharAplicativo);
	}		
	
	private void adivinharPrato(NoArvoreBinaria no){
		boolean resposta = messanger.perguntar("O prato que você pensou é "+ no.getValor() +"?", "Confirm");
		
		if(resposta){
			if(no.getNoDireito() == null){
				messanger.informar("Acertei de novo!", "Jogo Gourmet");
			} else {
				adivinharPrato(no.getNoDireito());
			}
		} else {
			if(no.getNoEsquerdo() == null){
				String prato = messanger.obterInformacao("Qual prato você pensou?");
				String caracteristica = messanger.obterInformacao(prato +" é ________ mas "+ no.getValor() +" não");
				if (prato != null && caracteristica != null)
					inserirNo(no, prato, caracteristica);				
			} else {
				adivinharPrato(no.getNoEsquerdo());
			}
		}
	}
	
	private void inserirNo(NoArvoreBinaria no, String resposta, String caracteristica){
		String valor = no.getValor();
		no.setValor(caracteristica);
		no.setNoDireito(new NoArvoreBinaria(resposta));
		no.setNoEsquerdo(new NoArvoreBinaria(valor));
	}
	
}
