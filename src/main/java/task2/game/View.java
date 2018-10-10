package task2.game;

 class View {

    static final String MESSAGE_INTRO="HELLO! LET`S PLAY!";
    static final String MESSAGE_BIGGER="Try bigger number.";
    static final String MESSAGE_LESS="Try less number.";
    static final String MESSAGE_OUT_OF_RANGE="The number is out of allowable range.";
 //   public static final String MESSAGE_WRONG_VALUE="Wrong input type, try \"int\" please. " ;
    static final String MESSAGE_CONGRATULATION="CONGRATULATION!!! You win!!!";

     void printMessage(String message){
        System.out.println(message);
    }
}
