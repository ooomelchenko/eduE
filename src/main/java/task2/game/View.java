package task2.game;

public class View {
    public static final String MESSAGE_INTRO="HELLO! LET`S PLAY!";
    public static final String MESSAGE_BIGGER="Try bigger number";
    public static final String MESSAGE_LESS="Try less number";
    public static final String MESSAGE_OUT_OF_RANGE="The number is out of allowable range";
    public static final String MESSAGE_WRONG_VALUE="Wrong input type, try \"int\" please " ;
    public static final String MESSAGE_CONGRATULATION="CONGRATULATION!!! You win!!!";
    public void printMessage(String message){
        System.out.println(message);
    }
}
