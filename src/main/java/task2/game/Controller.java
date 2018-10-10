package task2.game;

import task2.game.model.Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Model getModel() {
        return model;
    }
    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }
    public void setView(View view) {
        this.view = view;
    }

    public Controller() {
    }
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void playGame(int min, int max){
        List tryList = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        model.rand(min, max);
        view.printMessage(View.MESSAGE_INTRO);
        view.printMessage("The range of int numbers is from"+model.getMin()+" to "+model.getMax());
        while( ! sc.hasNextInt()) {
            sc.nextInt();

        }

    }


}
