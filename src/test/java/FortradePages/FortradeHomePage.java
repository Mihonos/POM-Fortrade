package FortradePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    dontAllowBtn.click();
}

/*public void chooseLng(){
    lngBtn.click();
    countryBtn.click();
}*/

public void openAccount(){

    Actions hover = new Actions(driver);
    hover.moveToElement(openAccBtn);
    hover.moveToElement(realBtn);
    hover.click().build().perform();
}

}
