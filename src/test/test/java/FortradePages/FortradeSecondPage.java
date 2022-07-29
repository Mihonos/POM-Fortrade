package FortradePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FortradeSecondPage {

    WebDriver driver;

    public FortradeSecondPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@name=\"Country\"]")
    WebElement countryBtn;
    @FindBy(xpath = "//input[@name=\"Address\"]")
    WebElement addressBtn;
    @FindBy(xpath = "//input[@name='City']")
    WebElement cityBtn;
    @FindBy(xpath = "//input[@name='BtnNext2']")
    WebElement secNextBtn;

    public void enterCountry(){
       countryBtn.sendKeys("Serbia");
        /*Select countryDropdown = new Select(countryBtn);
        countryDropdown.selectByVisibleText("Serbia");*/
    }

    public void enterAddress(){ addressBtn.sendKeys("migels"); }

    public void enterCity(){
        cityBtn.sendKeys("jhsdyy");
    }

    public void clickSecNextBtn(){
        secNextBtn.click();
    }

}
