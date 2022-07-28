package FortradePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FortradeAccountPage {

WebDriver driver;


    public FortradeAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "[name='FirstName']")
    WebElement firstNameBtn;

    @FindBy (css = "[name='LastName']")
    WebElement lastName;

    @FindBy (css = "[placeholder='*Email Address']")
    WebElement email;

    @FindBy (xpath = "//input[@name=\"PhoneCountryCode\"]")
    WebElement countryCoPhone;

    @FindBy (css = "[placeholder='*Phone']")
    WebElement phoneNo;

    @FindBy (css = "[name='BtnNext']")
    WebElement nextBtn;


    public void enterFirstName(){
        firstNameBtn.sendKeys("test");
    }

    public void enterLastName(){
        lastName.sendKeys("testimus");
    }

    public void enterEmail(){
        email.sendKeys("test"+System.currentTimeMillis()/1000000+"@mailinator.com");

        System.out.println(email.getText());
    }

    //public void printEmail(){ System.out.println(email.getText()); }

    public void eraseCountryCode(){ countryCoPhone.clear();}

    public void enterCountryCode(){ countryCoPhone.sendKeys("381");}

    public void enterPhone(){
        phoneNo.sendKeys("1"+System.currentTimeMillis()/1000);
    }

    public void clickNext(){
        nextBtn.click();
    }

}
