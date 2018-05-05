package domain;

import javax.swing.JOptionPane;

import interfaces.UserMessanger;

public class SwingMessanger implements UserMessanger{

	@Override
	public boolean perguntar(String mensagem, String titulo) {
		return JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION;
	}

	@Override
	public String obterInformacao(String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}

	@Override
	public void informar(String mensagem, String titulo) {
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public boolean informarInicio(String mensagem, String titulo) {
		return JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.CLOSED_OPTION;
	}

}
