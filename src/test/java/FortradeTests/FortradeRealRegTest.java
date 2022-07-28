package FortradeTests;

import FortradePages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FortradeRealRegTest {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver103.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.fortrade.com/");
    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }

    @Test
    public void realRegistration() throws InterruptedException{

        FortradeHomePage fortradeHomePage = new FortradeHomePage(driver);
        fortradeHomePage.removeIframe();
        //fortradeHomePage.chooseLng();
        fortradeHomePage.openAccount();

        FortradeAccountPage fortradeAccountPage = new FortradeAccountPage(driver);
        fortradeAccountPage.enterFirstName();
        fortradeAccountPage.enterLastName();
        fortradeAccountPage.enterEmail();
        //fortradeAccountPage.printEmail();
        fortradeAccountPage.eraseCountryCode();
        fortradeAccountPage.enterCountryCode();
        fortradeAccountPage.enterPhone();
        fortradeAccountPage.clickNext();

        FortradeSecondPage fortradeSecondPage = new FortradeSecondPage(driver);
        fortradeSecondPage.enterCountry();
        fortradeSecondPage.enterAddress();
        fortradeSecondPage.enterCity();
        fortradeSecondPage.clickSecNextBtn();

        FortradeThirdPage fortradeThirdPage = new FortradeThirdPage(driver);
        fortradeThirdPage.enterPassword();
        fortradeThirdPage.enterDay();
        fortradeThirdPage.enterMonth();
        fortradeThirdPage.enterYear();
        fortradeThirdPage.clickthirdNextBtn();

        FortradeFourthPage fortradeFourthPage = new FortradeFourthPage(driver);
        fortradeFourthPage.enterEmploymentStatus();
        fortradeFourthPage.enterIncome();
        fortradeFourthPage.clickFourthNextBtn();

        FortradeFifthPage fortradeFifthPage = new FortradeFifthPage(driver);
        fortradeFifthPage.tickCheckBox();
        fortradeFifthPage.pressSendBtn();

        WebElement logoutBtn = driver.findElement(By.xpath("//span[@class=\"headerLogout logout\"]"));
        Assert.assertEquals(false, logoutBtn.isDisplayed());
        System.out.println("logout btn is displayed - real account registered!");

        /*WebElement emailTextBox = driver.findElement(By.id("loginUserEmail"));
        System.out.println(emailTextBox.getText());*/

        Thread.sleep(5000);

    }

}
