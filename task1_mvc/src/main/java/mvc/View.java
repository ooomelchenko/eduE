package mvc;

/**
 * Created by HP-PC on 10.08.2018.
 */
public class View {
    // Text's constants
    public static final String INPUT_HELLO = "Input \"Hello\" word = ";
    public static final String INPUT_WORLD = "Input \"world!\" word = ";

    public static final String WRONG_INPUT_DATA = "Wrong word! Repeat please! ";

    public static final String OUT_TEXT = "Greeting text = ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageWithTwoWords(String firstWord, String secondWord){
        System.out.println(firstWord + secondWord);
    }

}
