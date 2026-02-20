package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class CartPage {
    WebDriver driver;
    
    @FindBy(className = "cart-item")
    List<WebElement> cartItems;
    
    @FindBy(id = "total-price")
    WebElement totalPrice;
    
    @FindBy(id = "checkout-btn")
    WebElement checkoutButton;
    
    @FindBy(className = "remove-item")
    List<WebElement> removeButtons;
    
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public int getItemCount() {
        return cartItems.size();
    }
    
    public String getTotalPrice() {
        return totalPrice.getText();
    }
    
    public void clickCheckout() {
        checkoutButton.click();
    }
    
    public void removeFirstItem() {
        if (removeButtons.size() > 0) {
            removeButtons.get(0).click();
        }
    }
    
    public boolean isCartEmpty() {
        return cartItems.size() == 0;
    }
}
