package MercuryTestMethods;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.LogStatus;
import driverScript.AbsClass_MethodOverride;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by zakir on 6/10/2017.
 */
public class LogIn extends AbsClass_MethodOverride {


    public static void LogIn(String userName, String password) throws IOException, BiffException, InterruptedException {

        try {
            test.log(LogStatus.INFO, "Clicking on home on the field");
            driver.findElement(By.xpath("//*[text()='Home']")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on home on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "homeClickError");

        }
        try {
            test.log(LogStatus.INFO, "Entering user name on the field");
            driver.findElement(By.name("userName")).sendKeys("kobebryant");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter user name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "userNameError2");

        }

        try {
            test.log(LogStatus.INFO, "Entering password on the field");
            driver.findElement(By.name("password")).sendKeys("kb24la4life");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter password on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "passwordError2");

        }

    }
}
