package MercuryTestMethods;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.LogStatus;
import driverScript.AbsClass_MethodOverride;
import jxl.write.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static driverScript.AbsClass_MethodOverride.driver;
import static driverScript.AbsClass_MethodOverride.test;

/**
 * Created by zakir on 6/10/2017.
 */
public class Registration extends AbsClass_MethodOverride {

    public static String SignUp(String firstName, String lastName, String phone, String email, String address, String city, String state, String postalCode, String userName, String password, String confirmPassword) throws IOException, InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        String message = null;
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        try {
            test.log(LogStatus.INFO, "Clicking on register");
            driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on Register");
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "registerError");
        }

        try {
            test.log(LogStatus.INFO, "Entering first name on the field");
            //line below will enter first name
            driver.findElement(By.name("firstName")).sendKeys(firstName);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter first name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "firstNameError");
        }

        try {
            test.log(LogStatus.INFO, "Entering last name on the field");
            //line below will enter last name
            driver.findElement(By.name("lastName")).sendKeys(lastName);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter last name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "lastNameError");

        }

        try {
            test.log(LogStatus.INFO, "Entering phone number on the field");
            //line below will enter phone number
            driver.findElement(By.name("phone")).sendKeys(phone);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter phone number on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "phoneError");

        }

        try {
            test.log(LogStatus.INFO, "Entering e-mail on the field");
            //line below will enter e-mail
            driver.findElement(By.id("userName")).sendKeys(email);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter e-mail on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "emailError");

        }

        try {
            test.log(LogStatus.INFO, "Entering address on the field");
            //line below will enter address
            driver.findElement(By.name("address1")).sendKeys(address);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter address on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "addressError");

        }

        try {
            test.log(LogStatus.INFO, "Entering city on the field");
            //line below will enter city
            driver.findElement(By.name("city")).sendKeys(city);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter city on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "cityError");

        }

        try {
            test.log(LogStatus.INFO, "Entering state on the field");
            //line below will enter state
            driver.findElement(By.name("state")).sendKeys(state);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter state on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "stateError");

        }

        try {
            test.log(LogStatus.INFO, "Entering postal code on the field");
            //line below will enter postal code
            driver.findElement(By.name("postalCode")).sendKeys(postalCode);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter postal code on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "postalCodeError");

        }

        try {
            test.log(LogStatus.INFO, "Entering user name on the field");
            //line below will enter user name
            driver.findElement(By.id("email")).sendKeys(userName);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter user name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "userNameError");

        }

        try {
            test.log(LogStatus.INFO, "Entering password on the field");
            //line below will enter password
            driver.findElement(By.name("password")).sendKeys(password);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter password on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "passwordError");

        }

        try {
            test.log(LogStatus.INFO, "Entering to confirm password on the field");
            //line below will enter confirm password
            driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter in confirm password on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "confirmPasswordError");

        }

        try {
            test.log(LogStatus.INFO, "Clicking register on the field");
            //line below will click on register button to sign up
            driver.findElement(By.name("register")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click register on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "registrationError");

        }
        Thread.sleep(3000);

        try {
            message = driver.findElement(By.xpath("//*[contains(text(),'Your user name is')]")).getText();


        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to get text - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "confirmError");
        }

        return message;
    }


}
