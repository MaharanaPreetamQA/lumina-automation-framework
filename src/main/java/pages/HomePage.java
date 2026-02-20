package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    
    @FindBy(className = "welcome-message")
    WebElement welcomeMessage;
    
    @FindBy(id = "search-input")
    WebElement searchInput;
    
    @FindBy(id = "search-btn")
    WebElement searchButton;
    
    @FindBy(linkText = "Logout")
    WebElement logoutLink;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }
    
    public void searchProduct(String productName) {
        searchInput.sendKeys(productName);
        searchButton.click();
    }
    
    public void logout() {
        logoutLink.click();
    }
    
    public boolean isWelcomeMessageDisplayed() {
        return welcomeMessage.isDisplayed();
    }
}
