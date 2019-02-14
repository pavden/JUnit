
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class ArithmeticTest {

    private static Arithmetic a;

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Rule
    public Timeout timeout = new Timeout(1000, TimeUnit.MILLISECONDS);

    @BeforeClass
    public static void initializeArithmetic() {
        a = new Arithmetic();
    }

    @Test
    public void addTest() {
        double res = a.add(3.0, 7.0);
        Assert.assertEquals(10.0, res, 0);
    }

    @Ignore
    @Test
    public void subTest() {
        double res = a.sub(3.0, 7.0);
        Assert.assertEquals(-4.0, res, 0);
    }

    @Test
    public void mulTest() {
        double res = a.mul(3.0, 7.0);
        Assert.assertEquals(21.0, res, 0);
    }

    @Test
    public void divTest() {
        double res = a.div(10.0, 5.0);
        Assert.assertEquals(2.0, res, 0);
    }

    // @Test(expected = ArithmeticException.class)
    @Test
    public void divExceptionTest() {
        exception.expect(ArithmeticException.class); // added
        a.div(10.0, 0.0);
    }

    // @Test(timeout = 1000)
    @Test
    public void divTimingTest() {
        a.div(10.0, 10.0);
    }

}
