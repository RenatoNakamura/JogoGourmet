package main;

import domain.GameGourmet;
import domain.SwingMessanger;
import interfaces.UserMessanger;
import service.GameService;

public class AppMain {
	public static void main(String[] args) {
		UserMessanger messager = new SwingMessanger();
		GameService service = new GameService();
		service.executarGame(new GameGourmet(messager));
	}
}
