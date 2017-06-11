package driverScript;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

/**
 * Created by zakir on 6/4/2017.
 */
public abstract class AbsClass_MethodOverride {
    public static WebDriver driver;
    public static ExtentReports report;
    public static ExtentTest test;
    public static String reportPath = null;

    @Parameters ("BrowserUrl")
    @BeforeSuite
    public static void openBrowser(String BrowserUrl) throws InterruptedException, IOException {
        System.out.println ("::::::::::::::CLOSING ALL INSTANCES OF CHROME DRIVER");
        //Kill ALL instances and services of chrome and chromedriver then free memory
        Runtime.getRuntime().exec("src\\main\\resources\\CleanUp.cmd");
        reportPath = "src\\main\\java\\ExtentReport\\ExtentReport.html";
        //report = new ExtentReports("C:\\Users\\zakir\\Documents\\Reports\\extentReport.html");
        report = new ExtentReports(reportPath, true);
        // code below is defining chrome driver from reusable method
        driver = reusableMethods.wDriver();

        test = report.startTest("MercurySignUP", "Mercury Tours Sign Up");

        test.log(LogStatus.INFO, "navigating to Mercury Tour sign up page registration page");
        //code below will allow me to navigate to gmail sign up page
        driver.navigate().to("http://newtours.demoaut.com/index.php");
        Thread.sleep(3000);
        driver.navigate().to(BrowserUrl);

    }


    @AfterSuite (alwaysRun = true)
    public static void closeBrowser() {
        //to end extent test you need to call the command below
        report.endTest(test);
        //line below will flush the report
        report.flush();


        //line below will open the report
        driver.get("C:\\Users\\zakir\\Documents\\MyMavenProject\\" + reportPath);

        //line below will close the report
        //report.close();


        // driver.quit();
    }
}
