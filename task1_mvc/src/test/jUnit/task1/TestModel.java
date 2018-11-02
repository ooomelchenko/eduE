package task1;

import mvc.Model;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestModel {

    private Model model;

    @Before
    public void init(){
        model = new Model();
    }

    @Test
    public void getOutText(){
        model.setOutText("first");
        Assert.assertEquals("first", model.getOutText());
    }

    @Test
    public void testGetOutText(){
        model.setOutText("first", "second");
        Assert.assertEquals("first second", model.getOutText());
    }

    @Test
    public void testSetEquals(){
        model.setOutText("first", "");

        Model m1 = new Model();
        m1.setOutText("first");

        Assert.assertEquals(m1.getOutText()+" ", model.getOutText());

    }
}
