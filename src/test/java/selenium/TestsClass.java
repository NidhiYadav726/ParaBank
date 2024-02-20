package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
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


    @Test
    public void testNewAccountOpening() {
        newAccountOpening account = PageFactory.initElements(driver, newAccountOpening.class);
        account.clickNewAccount();
        account.setAccountType("SAVINGS");
        account.setAmount("18006");
        account.clickOpenNewAccount();

    }

    @Test
    public void testTransferFunds() {
        TransferFund transferFunds = PageFactory.initElements(driver, TransferFund.class);
        transferFunds.clickTransferFunds();
        transferFunds.setTransferAmount("1589");
        transferFunds.setFromAccount("14454");
        transferFunds.setToAccount("14010");
        transferFunds.clickTransferButton();
    }

    @Test
    public void testRequestLoans() {
        RequestLoan requestLoan = PageFactory.initElements(driver, RequestLoan.class);
        requestLoan.clickRequestLoans();
        requestLoan.setLoanAmount("1456");
        requestLoan.setDownPaymentAmount("1432");
        requestLoan.setFromAccount("14010");
        requestLoan.setClickApplyNow();
    }
    @Test
    public void testBillPay(){
        billPay BillPay = PageFactory.initElements(driver,billPay.class);
        BillPay.clickBillPay();
        BillPay.setPayeeName("abcs");
        BillPay.setStreetAddress("kjj");
        BillPay.setCityAddress("Delhi");
        BillPay.setStateAddress("Uttar Pradesh");
        BillPay.setZipCode("9087");
        BillPay.setPhoneNumber("89466267547");
        BillPay.setAccountNumber("14010");
        BillPay.setVerifyAccount("14010");
        BillPay.setBillPayAmount("1490");
        BillPay.setFromAccount("14454");
        BillPay.setSendPaymentButtonPay();
    }


}

