package task2.game.model;

public class Model implements IModel {
    public final static int RAND_MAX =1000;

    public Model() {
    }

    @Override
    public int rand(){
        return (int) (Math.random() * (RAND_MAX + 1));
    }

    @Override
    public int rand(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
