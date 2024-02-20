package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login;
import pages.Registeration;
import pages.newAccountOpening;
import util.Base;

public class TestsClass extends Base {

    @Test
    public void testLogin() {
        Login login = PageFactory.initElements(driver, Login.class);
        login.setUsername("existingUser");  // Assuming this username already exists
        login.setPassword("existingPassword");  // Provide the correct password
        login.clickLoginButton();


    }

//    @Test
//    public void testRegister() {
//        Registeration register = PageFactory.initElements(driver, Registeration.class);
//        // Set up registration data with an existing username
//        register.clickRegister();
//        register.setFirstName("mno");
//        register.setLastName("jkl");
//        register.setStreet("lane 1");
//        register.setCity("delhi");
//        register.setState("uttar pradesh");
//        register.setZipCode("5768");
//        register.setPhoneNumber("7564789380");
//        register.setSsn("899");
//        register.setUsername("mno");  // Use an existing username
//        register.setPassword("mno@90");
//        register.setRepeatedPassword("mno@90");
//        register.clickRegisterButton();




    }

//    @Test
//    public void tests3() {
//        newAccountOpening account = PageFactory.initElements(driver, newAccountOpening.class);
//        // Add relevant code for the newAccountOpening test case
//    }
//
