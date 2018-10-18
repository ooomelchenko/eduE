package task2.game;

import task2.game.model.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller() {
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame(int minValue, int maxValue) {
        run(minValue, maxValue);
    }
    public void startGame() {
        run(0, Model.RAND_MAX);
    }

    private void run(int min, int max) {

        int goal = model.rand(min, max);

        List<Integer> tryList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        view.printMessage(View.MESSAGE_INTRO);
        view.printMessage(View.RANGE(min, max));

        while (true) {

            int input = sc.nextInt();

            if (!model.isInRange(min, max, input)) {
                view.printMessage(View.MESSAGE_OUT_OF_RANGE + View.RANGE(min, max));

            } else if (input < goal) {
                tryList.add(input);
                min = input + 1;
                view.printMessage(View.MESSAGE_BIGGER + View.RANGE(min, max));

            } else if (input > goal) {
                tryList.add(input);
                max = input - 1;
                view.printMessage(View.MESSAGE_LESS + View.RANGE(min, max));

            } else {
                tryList.add(input);
                view.printMessage(View.MESSAGE_CONGRATULATION);
                view.printMessage("You made " + tryList.size() + " attempts.");
                view.printMessage("Here is your way to win: " + tryList.toString());
                return;
            }

        }

    }


}
