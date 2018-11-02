package mvc;

import java.util.Scanner;

/**
 * Created by HP-PC on 10.08.2018.
 */
public class Controller {

    private Model model;
    private View view;

    //Getters & Setters
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

    // Constructor
    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setOutText(inputHelloWithScanner(sc), inputWorldWithScanner(sc));

        view.printMessageWithTwoWords(View.OUT_TEXT, model.getOutText());
    }

    // The Utility methods
    private String inputHelloWithScanner(Scanner sc) {

        view.printMessage(View.INPUT_HELLO);
        while( ! sc.hasNext("Hello")) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_HELLO);
            sc.next();
        }
        return sc.next();
    }
    private String inputWorldWithScanner(Scanner sc) {

        view.printMessage(View.INPUT_WORLD);
        while( ! sc.hasNext("world!")) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_WORLD);
            sc.next();
        }
        return sc.next();
    }
}
