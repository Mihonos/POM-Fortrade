package FortradePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FortradeFifthPage {

    WebDriver driver;

    public FortradeFifthPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[@for=\"TermsAgreement\"]")
    WebElement checkBox;
    @FindBy(xpath = "//input[@class=\"Send-Submit\"]")
    WebElement sendBtn;

    public void tickCheckBox(){
        checkBox.click();
    }

    public void pressSendBtn(){
        sendBtn.click();
    }

}

