package noteBook.controller;

import noteBook.model.Model;
import noteBook.view.View;
import java.util.Scanner;


public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputRecordNoteBook inputRecordNoteBook = new InputRecordNoteBook(model, view, sc);

        inputRecordNoteBook.inputRecord();

    }

}
