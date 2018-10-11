package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task2.game.model.Model;

public class TestModel {

    private Model model;

    private static int RAND_MAX = Model.RAND_MAX;

    @Before
    public void init(){
        model = new Model();
    }

    @Test
    public void testRand1(){
        Assert.assertTrue(model.rand()>=0);
    }
    @Test
    public void testRand2(){
        Assert.assertTrue(model.rand()<=RAND_MAX);
    }
    @Test
    public void testRand3(){
        Assert.assertTrue(model.rand(0, 100)>=0);
    }
    @Test
    public void testRand4(){
        Assert.assertTrue(model.rand(0, 100)<=100);
    }
    @Test
    public void testIsInRange1(){
        Assert.assertTrue(model.isInRange(0, 100, 0) && model.isInRange(0,100, 100));
    }
    @Test
    public void testIsInRange2(){
        Assert.assertTrue(model.isInRange(50, 1000, 500));
    }

}
