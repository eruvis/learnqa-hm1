import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        int localNumber = mainClass.getLocalNumber();
        Assert.assertTrue(localNumber + "(local number)" + " != 14", localNumber == 14);
    }
}
