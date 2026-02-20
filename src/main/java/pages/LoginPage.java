package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    
    @FindBy(id = "email")
    WebElement emailField;
    
    @FindBy(id = "password")
    WebElement passwordField;
    
    @FindBy(id = "loginBtn")
    WebElement loginButton;
    
    @FindBy(className = "error-message")
    WebElement errorMessage;
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
    
    public String getErrorMessage() {
        return errorMessage.getText();
    }
    
    public boolean isLoginButtonDisplayed() {
        return loginButton.isDisplayed();
    }
}
