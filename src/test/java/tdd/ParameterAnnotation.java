package tdd;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation
{

    @Test
    @Parameters("url")
    public void getGoogleApplication(@Optional("https://www.timeofindia.com") String myUrl)
    {
        System.out.println("myUrl: " + myUrl);
    }
}
