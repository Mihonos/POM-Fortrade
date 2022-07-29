package FortradePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FortradeHomePage {

WebDriver driver;


    public FortradeHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

@FindBy(xpath = "//button[text()=\"Don't allow\"]")
    WebElement dontAllowBtn;

    /*@FindBy(css = "[class=\"langDDbutton langDDjs langDDcurrent\"]")
    WebElement lngBtn;

    @FindBy(css = "a[title=\"de\"]")
    WebElement countryBtn;*/

    @FindBy(xpath = "//a[text()='Open Account']")
    WebElement openAccBtn;

    @FindBy(xpath = "//a[text()='Real']")
    WebElement realBtn;



    public void removeIframe (){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(dontAllowBtn));
    dontAllowBtn.click();
}

/*public void chooseLng(){
    lngBtn.click();
    countryBtn.click();
}*/

public void openAccount(){
WebDriverWait wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.elementToBeClickable(openAccBtn));
    Actions hover = new Actions(driver);
    hover.moveToElement(openAccBtn);
    hover.moveToElement(realBtn);
    hover.click().build().perform();
}

}
