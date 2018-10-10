package task2.game.model;

public interface IModel {

    int rand();
    int rand(int min, int max);

    boolean isInRange(int uTry);

}
