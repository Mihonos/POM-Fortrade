package FortradePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FortradeFourthPage {

    WebDriver driver;

    public FortradeFourthPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[name=\"EmploymentStatus\"]")
    WebElement employmentTextBox;
    @FindBy(css = "[name=\"EstimatedAnnualIncome\"]")
    WebElement incomeTextBox;
    @FindBy(css = "[name=\"BtnStep5Next\"]")
    WebElement fourthNextBtn;

    public void enterEmploymentStatus(){
        Select dropdown = new Select(employmentTextBox);
        dropdown.selectByIndex(2);
    }

    public void enterIncome(){
        Select dropdown = new Select(incomeTextBox);
        dropdown.selectByIndex(1);
    }

    public void clickFourthNextBtn(){
        fourthNextBtn.click();
    }




}
