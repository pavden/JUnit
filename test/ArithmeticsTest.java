
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArithmeticsTest {

    private Arithmetics a;

    @Before
    public void initializeArithmetics() {
        a = new Arithmetics();
    }

    @Test
    public void addTest() {
        double res = a.add(3, 7);
        Assert.assertEquals(res, 10.0, 0);
    }

    @Test
    public void deductTest() {
        double res = a.deduct(3, 7);
        Assert.assertEquals(res, -4.0, 0);
    }

    @Test
    public void multTest() {
        double res = a.mult(3, 7);
        Assert.assertEquals(res, 21.0, 0);
    }

    @Test
    public void divTest() {
        double res = a.div(10, 5);
        Assert.assertEquals(res, 2.0, 0);
    }

}
