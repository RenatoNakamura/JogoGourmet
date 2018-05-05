package interfaces;

public interface UserMessanger {
	boolean perguntar(String mensagem, String titulo);
	boolean informarInicio(String mensagem, String titulo);
	void informar(String mensagem, String titulo);
	String obterInformacao(String mensagem);
}
