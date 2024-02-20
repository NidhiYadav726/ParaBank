package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFund {
    private WebDriver driver;
    @FindBy(linkText = "Transfer Funds")
    private WebElement transferFunds;
    @FindBy(id = "amount")
    private WebElement transferAmount ;
    @FindBy(id = "fromAccountId")
    private WebElement sourceAccount;

    @FindBy(id ="toAccountId")
    private WebElement destinationAccount;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/div[2]/input")
    private WebElement transferButton;

    public TransferFund(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickTransferFunds() {
        transferFunds.click();

    }
    public void setTransferAmount(String amount) {
        transferAmount.clear();
        transferAmount.sendKeys(amount);
    }

    public void setFromAccount(String fromAccount) {
        Select fromAccountDropdown  = new Select(sourceAccount);
        fromAccountDropdown.selectByVisibleText(fromAccount);
    }

    public void setToAccount(String toAccount) {
        Select toAccountDropdown  = new Select(destinationAccount);
        toAccountDropdown.selectByVisibleText(toAccount);
    }
    public void clickTransferButton() {
        transferButton.click();

    }
}
