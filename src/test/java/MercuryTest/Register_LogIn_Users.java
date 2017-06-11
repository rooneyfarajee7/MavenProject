package MercuryTest;

import MercuryTestMethods.LogIn;
import MercuryTestMethods.Registration;
import driverScript.AbsClass_MethodOverride;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static driverScript.AbsClass_MethodOverride.driver;

/**
 * Created by zakir on 6/10/2017.
 */
public class Register_LogIn_Users extends AbsClass_MethodOverride{

    String abc;
    WebDriverWait wait;
@Test
public static void SignUp_LogIn () throws IOException, BiffException, InterruptedException, WriteException {
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

            driver.navigate().to("http://newtours.demoaut.com/index.php");
            Thread.sleep(3000);

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            String message = Registration.SignUp(firstName,lastName,phone, email,address ,city, state, postalCode, userName,password,confirmPassword);

            Label label = new Label(10,i, message);
            sheet2.addCell(label);


            //Line below
            LogIn.LogIn(userName, password);
        }

        //only write anc close the Writable Workbook after for loop
        writeableWorkbook.write();
        writeableWorkbook.close();


    }
}
