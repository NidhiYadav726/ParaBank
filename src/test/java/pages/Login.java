package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[1]/input")
    private WebElement usernameInput;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[2]/input")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[3]/input")
    private WebElement loginButton;
    @FindBy(id = "loginPageIdentifier")
    private WebElement loginPageIdentifier;


    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username) {
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();

    }

}


