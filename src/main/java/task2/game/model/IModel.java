package task2.game.model;

public interface IModel {

    int rand();
    int rand(int min, int max);

    default boolean isInRange( int min, int max, int uTry) {
        return (uTry >= min && uTry <= max);
    }

}
