import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest
{
    @Test
    @Parameters("url")
    public void launchGoogle(String appUrl)
    {
        System.out.println("MY NAME IS : "+appUrl);
    }
}
