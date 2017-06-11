import Utilities.reusableMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * Created by zakir on 6/3/2017.
 */
public class practiceTest {

    static WebDriver driver;

    @Test
    public static void test (){

        driver = reusableMethods.wDriver();

        driver.get("https://www.google.com/");


    }
}
