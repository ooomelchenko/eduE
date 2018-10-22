package noteBook;


import noteBook.controller.Controller;
import noteBook.model.Model;
import noteBook.view.View;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Controller controller = new Controller(new Model(), new View());
        // Run
        controller.processUser();
        controller.processUser();
    }
}
