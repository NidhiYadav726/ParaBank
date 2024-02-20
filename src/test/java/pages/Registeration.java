package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeration {
    private WebDriver driver;
    @FindBy(xpath = "//*[@id=\"loginPanel\"]/p[2]/a")
    private WebElement Register;

    @FindBy(css ="input[id='customer.firstName']")
    private WebElement firstNameInput;
    @FindBy(css ="input[id='customer.lastName']")
    private WebElement lastNameInput;
    @FindBy(css ="input[id='customer.address.street']")
    private WebElement streetInput;
    @FindBy(css ="input[id='customer.address.city']")
    private WebElement cityInput;
    @FindBy(css ="input[id='customer.address.state']")
    private WebElement stateInput;
    @FindBy(css ="input[id='customer.address.zipCode']")
    private WebElement zipCodeInput;

    @FindBy(css ="input[id='customer.phoneNumber']")
    private WebElement phoneNumberInput;

    @FindBy(css ="input[id='customer.ssn']")
    private WebElement ssnInput;
    @FindBy(css ="input[id='customer.username']")
    private WebElement usernameInput;

    @FindBy(css ="input[id='customer.password']")
    private WebElement passwordInput;
    @FindBy(css ="input[id='repeatedPassword']")
    private WebElement confirmpassword;

    @FindBy(xpath ="//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
    private WebElement registerButton;

    public Registeration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickRegister() {
        Register.click();
    }

    public void setFirstName(String firstName) {
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
    }
    public void setLastName(String lastName) {
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
    }
    public void setStreet(String street) {
        streetInput.clear();
        streetInput.sendKeys(street);
    }
    public void setCity(String city) {
        cityInput.clear();
        cityInput.sendKeys(city);
    }
    public void setState(String state) {
        stateInput.clear();
        stateInput.sendKeys(state);
    }
    public void setZipCode(String zipCode) {
        zipCodeInput.clear();
        zipCodeInput.sendKeys(zipCode);
    }
    public void setPhoneNumber(String phoneNumber) {
        phoneNumberInput.clear();
        phoneNumberInput.sendKeys(phoneNumber);
    }
    public void setSsn(String ssn) {
        ssnInput.clear();
        ssnInput.sendKeys(ssn);
    }
    public void setUsername(String userName) {
        usernameInput.clear();
        usernameInput.sendKeys(userName);
    }
    public void setPassword(String Password) {
        passwordInput.clear();
        passwordInput.sendKeys(Password);
    }
    public void setRepeatedPassword(String confirmPassword) {
        confirmpassword.clear();
        confirmpassword.sendKeys(confirmPassword);
    }
    public void clickRegisterButton() {
      registerButton.click();

    }



}
