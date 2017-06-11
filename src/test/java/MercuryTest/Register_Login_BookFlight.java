package MercuryTest;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.LogStatus;
import driverScript.AbsClass_MethodOverride;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static driverScript.AbsClass_MethodOverride.driver;

/**
 * Created by zakir on 6/4/2017.
 */
public class Register_Login_BookFlight extends AbsClass_MethodOverride {

    @Test
    public static void testCase1() throws IOException, BiffException, InterruptedException, WriteException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // define the path of excel
        Workbook workbook = Workbook.getWorkbook(new File("src\\main\\java\\dataInput\\MercuryTours.xls"));
        //line below will define the worksheet that we are using
        Sheet workSheet = workbook.getSheet(0);
        //Sheet workSheet = workbook.getSheet("MortgageCalculator");
        //line below will define writeable workbook
        WritableWorkbook writeableWorkbook = Workbook.createWorkbook(new File("src\\main\\java\\dataInput\\MercuryTours_Results.xls"), workbook);
        //line below will define the writable sheet
        WritableSheet sheet2 = writeableWorkbook.getSheet(0);

        //line below will define the non-empty rows within sheet
        int rowNumber = workSheet.getRows();

        for (int i = 1; i <= rowNumber - 1; i++) {


            String firstName = workSheet.getCell(0, i).getContents();
            String lastName = workSheet.getCell(1, i).getContents();
            String phone = workSheet.getCell(2, i).getContents();
            String email = workSheet.getCell(3, i).getContents();
            String address = workSheet.getCell(4, i).getContents();
            String address2 = workSheet.getCell(5, i).getContents();
            String city = workSheet.getCell(6, i).getContents();
            String state = workSheet.getCell(7, i).getContents();
            String postalCode = workSheet.getCell(8, i).getContents();
            String country = workSheet.getCell(9, i).getContents();
            String userName = workSheet.getCell(10, i).getContents();
            String password = workSheet.getCell(11, i).getContents();
            String confirmPassword = workSheet.getCell(12, i).getContents();


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
                String message = driver.findElement(By.xpath("//*[contains(text(),'Your user name is')]")).getText();
                Label label = new Label(11, i, message);
                sheet2.addCell(label);
            } catch (Exception err) {
                test.log(LogStatus.FAIL, "Unable to get text - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "confirmError");
            }

        }

        //only write anc close the Writable Workbook after for loop
        writeableWorkbook.write();
        writeableWorkbook.close();

    }

    @Test(dependsOnMethods = "testCase1")


    public static void LogIn() throws IOException, BiffException, InterruptedException {
        //line below will declare that test will be used in this extent report
        test = report.startTest("Log In Test", "Mercury Tour Log In Page");
        test.log(LogStatus.INFO, "navigating to Mercury Tour registration page");


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
    
    @Test (dependsOnMethods = "LogIn")
    public void BookFlight () throws IOException {
        test = report.startTest("Book a flight test", "Book flight page");
        test.log(LogStatus.INFO,"navigating to book a flight page");
        
        try {
        test.log(LogStatus.INFO, "Clicking on submit on the field");
        driver.findElement(By.name("login")).click();

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to click on submit on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "submitError");

    }

        try {
        test.log(LogStatus.INFO, "Selecting New York on the departing field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromPort")), "New York");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select New york on the deaprting field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError1");

    }

        try {
        test.log(LogStatus.INFO, "Selecting date on the field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromDay")), "27");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select date on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError2");

    }

        try {
        test.log(LogStatus.INFO, "Selecting London on the arriving in field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toPort")), "London");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select London on the arriving in field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\" , "selError3");

    }

        try {
        test.log(LogStatus.INFO, "Selecting return month on the field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toMonth")), "July");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select return month on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError4");

    }

        try {
        test.log(LogStatus.INFO, "Selecting return date on the field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toDay")), "1");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select return month on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError5");

    }

        try {
        test.log(LogStatus.INFO, "Clicking service class on the field");
        driver.findElement(By.name("servClass")).click();

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError6");

    }

        try {
        test.log(LogStatus.INFO, "Selecting airline on the field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("airline")), "Blue Skies Airlines");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select airline on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError7");

    }

        try {
        test.log(LogStatus.INFO, "Clicking the continue button on the field");
        driver.findElement(By.name("findFlights")).click();

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError8");

    }

        try {
        test.log(LogStatus.INFO, "Clicking the continue button on the field");
        driver.findElement(By.name("reserveFlights")).click();

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError9");

    }

        try {
        test.log(LogStatus.INFO, "Clicking on home on the field");
        driver.findElement(By.xpath("//*[text()='Home']")).click();

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to click on home on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "homeClickError2");

    }

        try {
        test.log(LogStatus.INFO, "Entering user name on the field");
        driver.findElement(By.name("userName")).sendKeys("paulgeorge");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to enter user name on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "userNameError3");

    }

        try {
        test.log(LogStatus.INFO, "Entering password on the field");
        driver.findElement(By.name("password")).sendKeys("pg13isRatedR");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to enter password on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "passwordError3");

    }

        try {
        test.log(LogStatus.INFO, "Clicking on submit on the field");
        driver.findElement(By.name("login")).click();

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to click on submit on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "submitError2");

    }

        try {
        test.log(LogStatus.INFO, "Selecting New York on the deaprting field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromPort")), "New York");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select New york on the deaprting field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError10");

    }

        try {
        test.log(LogStatus.INFO, "Selecting date on the field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromDay")), "27");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select date on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError11");

    }

        try {
        test.log(LogStatus.INFO, "Selecting London on the arriving in field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toPort")), "London");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select Paris on the arriving in field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError12");

    }

        try {
        test.log(LogStatus.INFO, "Selecting return month on the field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toMonth")), "October");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select return month on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError13");

    }

        try {
        test.log(LogStatus.INFO, "Selecting return date on the field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toDay")), "21");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select return month on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError14");

    }

        try {
        test.log(LogStatus.INFO, "Clicking service class on the field");
        driver.findElement(By.name("ServClass")).click();

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError15#intentional");

    }

        try {
        test.log(LogStatus.INFO, "Selecting airline on the field");
        reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("airline")), "Blue Skies Airlines");

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select airline on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError17");

    }

        try {
        test.log(LogStatus.INFO, "Clicking the continue button on the field");
        driver.findElement(By.name("findFlights")).click();

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError18");

    }

        try {
        test.log(LogStatus.INFO, "Clicking the continue button on the field");
        driver.findElement(By.name("reserveFlights")).click();

    } catch (Exception err) {
        test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
        reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\Screenshots\\", "selError19");

    }

}

}
