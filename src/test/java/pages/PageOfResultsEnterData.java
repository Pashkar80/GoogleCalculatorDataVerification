package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 10.11.2019.
 */
public class PageOfResultsEnterData extends PageObject {


    public PageOfResultsEnterData(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
        driver.get("https://cloud.google.com/products/calculator/#id=c20c3ff1-3229-4438-884f-368a6d512daa");

    }



    @FindBy(xpath = "//*[@id='compute']//div[@class='md-list-item-text ng-binding'and contains(text(),'VM class:')]")
    private WebElement valueClassVM;



    @FindBy(xpath = "//*[@id='compute']//div[@class='md-list-item-text ng-binding'and contains(text(),' Instance type:')]")
    private WebElement valueInstanceType;



    @FindBy(xpath = "//*[@id='compute']//div[@class='md-list-item-text ng-binding'and contains(text(),' Region:')]")
    private WebElement valueRegion;


    @FindBy(xpath = "//*[@id='compute']//div[@class='md-list-item-text ng-binding'and contains(text(),' Total')]")
    private WebElement valueLocalSSD;




   @FindBy(xpath = "//*[@id='compute']//div[@class='md-list-item-text ng-binding'and contains(text(),'Commitment term:')]")
    private  WebElement valueCommitmentTerm;

   @FindBy(xpath = "//*[@id='resultBlock']//h2/b")
   private  WebElement valueAmount;

    public String getValueMachineClass() {
        String value = valueClassVM.getText();
        return value;
    }

    public String getValueInstanceType() {
        String value = valueInstanceType.getText();
        return value;
    }

    public String getValueRegion() {
        String value = valueRegion.getText();
        return value;
    }

    public String getValueLocalSSD() {
        String value = valueLocalSSD.getText();
        return value;
    }


    public String getValueCommitmentTerm(){
        String value = valueCommitmentTerm.getText();
        return  value;
    }

    public  String getValueAmuont(){
        String value = valueAmount.getText();
        return  value;
    }


}
