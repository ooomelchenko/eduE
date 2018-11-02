package game;

import game.model.Model;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.startGame(0, 100);
    }
}
