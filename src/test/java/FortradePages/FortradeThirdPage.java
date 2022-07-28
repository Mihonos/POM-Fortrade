package FortradePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FortradeThirdPage {

    WebDriver driver;


    public FortradeThirdPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[placeholder='*Password']")
    WebElement passwordTextBox;
    @FindBy(css = "[class='DayOfDate']")
    WebElement dayTextBox;
    @FindBy(css = "[class='DayOfMonth']")
    WebElement monthTextBox;
    @FindBy(css = "[class='DayOfYear']")
    WebElement yearTextBox;
    @FindBy(css = "[name='BtnStep4Next']")
    WebElement thirdNextBtn;


    public void enterPassword(){
        passwordTextBox.sendKeys("Aa1111");
    }

    public void enterDay(){
        Select select = new Select(dayTextBox);
        select.selectByIndex(1);
    }

    public void enterMonth(){
        Select select = new Select(monthTextBox);
        select.selectByIndex(1);
    }

    public void enterYear(){
        Select select = new Select(yearTextBox);
        select.selectByIndex(7);
    }

    public void clickthirdNextBtn(){
        thirdNextBtn.click();
    }


}
