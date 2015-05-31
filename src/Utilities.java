import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by dmc on 17/05/2015.
 */
public class Utilities {

    @Ignore
    @Test(timeout=200)
    public void Timeouts()
    {
        System.out.println("Testing a timeout on JUnit attribute");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(expected=InterruptedException.class, timeout=200)
    public void ExceptionTest()
    {
        System.out.println("Testing a timeout on JUnit attribute");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
