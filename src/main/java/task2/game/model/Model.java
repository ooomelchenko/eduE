package task2.game.model;

public class Model implements IModel {
    private final static int RAND_MAX =1000;

  //  private int goal;

    private int min;
    private int max;

    public Model(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public Model() {
        this.min = 0;
        this.max = 1000;
    }

    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public int rand(){
        return (int) (Math.random() * ((RAND_MAX - 0) + 1));
    }
    @Override
    public int rand(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    @Override
    public boolean isInRange(int uTry){
        return (uTry > min && uTry < max);
    }
}
