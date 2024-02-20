package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class billPay {
        private WebDriver driver;

        @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[4]/a")
        private WebElement clickBillPay;

        @FindBy(xpath = "//input[@name='payee.name']\n")
        private WebElement payeeName;

        @FindBy(xpath = "//input[@name='payee.address.street']\n")
        private WebElement streetAddress;

        @FindBy(xpath = "//input[@name ='payee.address.city']\n")
        private WebElement cityAddress;

        @FindBy(xpath = "//input[@name ='payee.address.state']\n")
        private WebElement stateAddress;

        @FindBy(xpath = "//input[@name='payee.address.zipCode']\n")
        private WebElement zipCode;

        @FindBy(xpath = "//input[@name='payee.phoneNumber']\n")
        private WebElement phoneNumber;

        @FindBy(xpath = "//input[@name='payee.accountNumber']\n")
        private WebElement accountNumber;

        @FindBy(xpath = "//input[@name='verifyAccount']\n")
        private WebElement verifyAccount;

        @FindBy(xpath = "//input[@name='amount']\n")
        private WebElement billPayAmount;

        @FindBy(xpath = "//input[@name='fromAccountId']\n")
        private WebElement billPayFromAccount;

        @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input")
        private WebElement sendPaymentButton;

        public billPay(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public void clickBillPay() {
            clickBillPay.click();
        }
        public void setPayeeName(String nameOfPayee) {
            payeeName.clear();
            payeeName.sendKeys(nameOfPayee);
        }
        public void setStreetAddress(String street) {
           streetAddress.clear();
            streetAddress.sendKeys(street);
        }
        public void setCityAddress(String city) {
            cityAddress.clear();
            cityAddress.sendKeys(city);
        }
        public void setStateAddress(String state) {
            stateAddress.clear();
            stateAddress.sendKeys(state);
        }
        public void setZipCode(String zipcode) {
            zipCode.clear();
           zipCode.sendKeys(zipcode);
        }
        public void setPhoneNumber(String phone) {
            phoneNumber.clear();
            phoneNumber.sendKeys(phone);
        }
        public void setAccountNumber(String account) {
            accountNumber.clear();
            accountNumber.sendKeys(account);
        }
        public void setVerifyAccount(String accountVerify) {
           verifyAccount.clear();
            verifyAccount.sendKeys(accountVerify);
        }
        public void setBillPayAmount(String billAmount) {
            billPayAmount.clear();
           billPayAmount.sendKeys(billAmount);
        }
        public void setFromAccount(String fromAccount) {
            billPayFromAccount.clear();
            billPayFromAccount.sendKeys(fromAccount);
        }
        public void setSendPaymentButtonPay(){
            sendPaymentButton.click();
        }



    }
