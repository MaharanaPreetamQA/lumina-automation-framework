package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;
import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://staging.lumina-fashion.co.uk/login");
        loginPage = new LoginPage(driver);
    }
    
    @Test
    public void testValidLogin() {
        loginPage.login("testuser@email.com", "password123");
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isWelcomeMessageDisplayed(), "Login failed");
    }
    
    @Test
    public void testInvalidLogin() {
        loginPage.login("wrong@email.com", "wrongpass");
        String errorMsg = loginPage.getErrorMessage();
        Assert.assertTrue(errorMsg.contains("Invalid credentials"), "Wrong error message");
    }
    
    @Test
    public void testEmptyFields() {
        loginPage.login("", "");
        Assert.assertTrue(loginPage.isLoginButtonDisplayed(), "Should stay on login page");
    }
    
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
