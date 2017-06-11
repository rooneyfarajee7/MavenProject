package Utilities;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.*;

/**
 * Created by zakir on 5/7/2017.
 */
public class reusableMethods {

    public static WebDriver wDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        //Chrome options is built in selenium command with java which allows you to pass addition arguments before defining a driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        //line below will defines the type of driver you are using to call the web
        WebDriver driver = new ChromeDriver(options);
        return driver;

    }


    //line below will select element by visible text from a'select' a tag name
    public static void selectElementFromDropDownByText(WebElement element, String visibleText) {

        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(visibleText);

    }

    //line below will select element by value from a 'select' tag name
    public static void selectElementFromDropDownByValue(WebElement element, String value) {

        Select dropdown = new Select(element);
        dropdown.selectByValue(value);

    }

    public static void scrollIntoElement(WebDriver driver, WebElement element) {

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    //the method below will define webdriver wait
    public static void webDriverWait(WebDriver driver, int seconds, String xpathExpression) {

        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));
    }

    //method below will take a screenshot
    public static void takeScreenshot (WebDriver driver, String path, String screenShotName) throws IOException {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //Now you can do whatever you need to do with it, ex copy somewhere
        FileUtils.copyFile(scrFile, new File(path + screenShotName + "png"));
    }

    //method below will take a screenshot
    public static void getScreenShot (WebDriver wDriver, ExtentTest test, String path, String screenshotName) throws IOException {
        String fileName= screenshotName + "png";
        File sourceFile = ((TakesScreenshot)wDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File (path + fileName));
        //String imgPath = directory + file name
        String image = test.addScreenCapture(path+ fileName);
        test.log(LogStatus.FAIL, "", image);

    }

}

