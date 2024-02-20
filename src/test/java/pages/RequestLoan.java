package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestLoan {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[7]/a")
    private WebElement clickRequestLoans;

    @FindBy(id = "amount")
    private WebElement loanAmount;

    @FindBy(id = "downPayment")
    private WebElement downPaymentAmount;

    @FindBy(id = "fromAccountId")
    private WebElement fromAccount;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[4]/td[2]/input")
    private WebElement clickApplyNow;

    public RequestLoan(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickRequestLoans() {
        clickRequestLoans.click();

    }
    public void setLoanAmount(String amountLoan){
        loanAmount.clear();
        loanAmount.sendKeys(amountLoan);
    }
    public void setDownPaymentAmount(String amountDownPayment){
        downPaymentAmount.clear();
        downPaymentAmount.sendKeys(amountDownPayment);
    }
    public void setFromAccount(String fromAccount1){
        fromAccount.clear();
        fromAccount.sendKeys(fromAccount1);
    }
    public void setClickApplyNow() {
        clickApplyNow.click();

    }
}
