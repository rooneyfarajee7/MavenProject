package homeWorks.DressHW;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import driverScript.AbsClass_MethodOverride;
import driverScript.abstractClassDress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by zakir on 6/9/2017.
 */

public class DressHW extends abstractClassDress {

    @Test (priority = 1 )
    public static void SignIn() throws IOException, InterruptedException {
        try {
            test.log(LogStatus.INFO, "Clicking on sign in");
            //line below will lick on sign in
            driver.findElement(By.className("login")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click sign in");
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "SignInError");
        }

        try {
            test.log(LogStatus.INFO, "entering email");
            //line below will enter email address to the field
            driver.findElement(By.id("email_create")).sendKeys("rooneyfarajee07@mymail.com");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter email");
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "EmailError");
        }

        try {
            test.log(LogStatus.INFO, "clicking on create an account");
            //line below will click on create an account
            driver.findElement(By.id("SubmitCreate")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "unable to click create an account");
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "CreateError");
        }

        try {
            test.log(LogStatus.INFO, "Clicking a gender on the field");
            driver.findElement(By.id("id_gender1")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select appropriate gender" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "GenderError");
        }

        Thread.sleep(3000);


        try {
            test.log(LogStatus.INFO, "Entering first name");
            //line below will enter first name
            driver.findElement(By.id("customer_firstname")).sendKeys("Rooney");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter the first name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "FirstNameError");
        }

        try {
            test.log(LogStatus.INFO, "Entering last name");
            //line below will enter last name
            driver.findElement(By.id("customer_lastname")).sendKeys("Farajee");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter the last name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "LastNameError");
        }

        try {
            test.log(LogStatus.INFO, "Entering password");
            //line below will enter password
            driver.findElement(By.id("passwd")).sendKeys("thisismypass");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter password on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "PassError");
        }

        try {
            test.log(LogStatus.INFO, "Selection birthday from dropdown on the field");
            reusableMethods.selectElementFromDropDownByValue(driver.findElement(By.id("days")), "21");;
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select date from drop down list - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "DayError");
        }

        try {
            test.log(LogStatus.INFO, "Selecting month from drop down list");
            //line below will enter month
            reusableMethods.selectElementFromDropDownByValue(driver.findElement(By.id("months")), "10");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select month from drop down list - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "MonthError");
        }

        try {
            test.log(LogStatus.INFO, "Selection birth year from dropdown on the field");
            reusableMethods.selectElementFromDropDownByValue(driver.findElement(By.id("years")), "1993");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select birth year from dropdown on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "YearError");
        }

        try {
            test.log(LogStatus.INFO, "Entering address on the field");
            //line below will enter address
            driver.findElement(By.name("address1")).sendKeys("1 Penn Plaza");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter address on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "AddressError");
        }

        try {
            test.log(LogStatus.INFO, "Entering city on the field");
            //line below will enter city
            driver.findElement(By.name("city")).sendKeys("New York");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter city on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "CityError");
        }

        try {
            test.log(LogStatus.INFO, "Selecting state from the list");
            //line below will select a state
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.id("id_state")), "New York");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select state from list- " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "StateError");
        }

        try {
            test.log(LogStatus.INFO, "Entering postal code on the field");
            //line below will enter postal code
            driver.findElement(By.name("postcode")).sendKeys("10021");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter postal code on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "ZipCodeError");
        }
        try {
            test.log(LogStatus.INFO, "Entering Country on the field");
            //line below will select country from list
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.id("id_country")), "United States");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter Country on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "CountryError");
        }

        try {
            test.log(LogStatus.INFO, "Entering Phone Number on the field");
            //line below will enter phone number
            driver.findElement(By.name("phone_mobile")).sendKeys("3471234567");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter phone number on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "PhoneError");
        }

        try {
            test.log(LogStatus.INFO, "click on submit");
            //line below will click on submit
            driver.findElement(By.id("submitAccount")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click submit" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "SubmitError");
        }

        Thread.sleep(3000);
    }

    @Test(dependsOnMethods = "SignIn")
    public static void shopping() throws IOException, InterruptedException {

        test = report.startTest("Shopping Test", "Shop and verify");
        test.log(LogStatus.INFO, "purchasing");

        try {
            test.log(LogStatus.INFO, "Mouse hovering on a dress on the field");
            WebElement element = driver.findElement(By.className("left-block"));
            //line below will define Actions for mouse movement
            Actions mousemovement = new Actions(driver);
            mousemovement.moveToElement(element).perform();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to mouseover" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "AddError");
        }

        try {
            test.log(LogStatus.INFO, "Clicking on add to cart on the field");
            driver.findElement(By.xpath("//*[@title='Add to cart']")).click();
            Thread.sleep(3000);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click add to cart on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "AddError");
        }

        try {
            test.log(LogStatus.INFO, "click on proceed to checkout");
            driver.findElement(By.className("btn btn-default button button-medium")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click proceed to checkout" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "CheckoutError");
        }

        try {
            test.log(LogStatus.INFO, "Proceeding to the checkout");
            driver.findElement(By.linkText("Proceed to checkout")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to proceed to the checkout" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "CheckoutError2");
        }

        try {
            test.log(LogStatus.INFO, "Verify address");
            driver.findElement(By.className("address_address1"));
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click proceed to checkout" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "VerifyError");
        }

        try {
            test.log(LogStatus.INFO, "Agree with terms and continue");
            driver.findElement(By.name("cgv")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to agree with terms and continue" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "AgreementError");
        }

        try {
            test.log(LogStatus.INFO, "click on proceed to checkout");
            driver.findElement(By.className("button btn btn-default button-medium")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click proceed to checkout" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "CheckoutError3");
        }

        try {
            test.log(LogStatus.INFO, "verify carrier");
            driver.findElement(By.name("processCarrier")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to verify carrier and continue" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "CarrierError3");
        }

        try {
            test.log(LogStatus.INFO, "Clicking on agreement");
            driver.findElement(By.name("cgv")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to agree with terms and continue" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "AgreementError2");
        }

        try {
            test.log(LogStatus.INFO, "click on proceed to checkout");
            driver.findElement(By.className("button btn btn-default standard-checkout button-medium")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click proceed to checkout" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "CheckoutError4");
        }

        try {
            test.log(LogStatus.INFO, "Pay By Check");
            driver.findElement(By.className("cheque")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to Pay by Check" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "CheckError");
        }

        reusableMethods.scrollIntoElement(driver, driver.findElement(By.className("page-subheading")));
        boolean elementPresent = driver.findElements(By.className("page-subheading")).size() > 0;
        if (elementPresent == true) {
            test.log(LogStatus.PASS, "Found Check Payment");
        } else {
            test.log(LogStatus.FAIL, "Unable to verify check payment");
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "FirstNameError");
        }

        }

}