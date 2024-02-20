package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class newAccountOpening {
    private WebDriver driver;
    @FindBy(linkText = "Open New Account")
    private WebElement accountOpening;

    @FindBy(id = "type")
    private WebElement accountTypeDropdown;

    @FindBy(xpath = "fromAccountId")
    private WebElement accountAmount;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/div/input")
    private  WebElement openNewAccountButton;


    public newAccountOpening(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickNewAccount() {
        accountOpening.click();

    }

    public void setAccountType(String accountType) {
        Select accTypeDropdown = new Select(accountTypeDropdown);
        accTypeDropdown.selectByVisibleText(accountType);
    }

    public void setAmount(String amount) {
        Select amountDropdown = new Select(accountAmount);
        amountDropdown.selectByVisibleText(amount);
    }

    public void clickOpenNewAccount(){
        openNewAccountButton.click();
    }
}






