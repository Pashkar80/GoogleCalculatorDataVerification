package tests;

import driver.LocalDriver;
import entity.Order;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PageOfCalculator;
import steps.CommonSteps;


public class ResultsTest {

    Order order = new Order("4",
            "Regular",
            "n1-standard-8",
            "2x375 GB",
            "Frankfurt",
            "1 Year",
            "USD 1,082.77");

    private WebDriver driver;
    private String request = "Google Cloud Platform Pricing Calculator";


    @BeforeTest
    public void initDriver() throws InterruptedException {
        driver = LocalDriver.initWebDriver();
        CommonSteps steps = new CommonSteps(driver);
        steps.pageSearching(request);
        steps.getSearchingResult();
        steps.fillOrderForm(order.getCountInstance());

    }


    @Test
    public void checkValueVirtualMachineClass() {
        CommonSteps steps = new CommonSteps(driver);
        String value = steps.getTitleVirtualMachineClass();
        Assert.assertEquals(value, order.getClassVM().toLowerCase());

    }

    @Test
    public void checkValueInstanceType() {
        CommonSteps steps = new CommonSteps(driver);
        String value = steps.getTitleInstanceType();
        Assert.assertEquals(value, order.getTypeInstance());
    }

    @Test
    public void checkValueRegion() {
        CommonSteps steps = new CommonSteps(driver);
        String value = steps.getTitleRegion();
        Assert.assertEquals(value, order.getRegion());
    }

    @Test
    public void checkValueLocalSSD() {
        CommonSteps steps = new CommonSteps(driver);
        String value = steps.getTitleLocalSSD();
        Assert.assertEquals(value, order.getLocalSSD());
    }

    @Test
    public void checkValueCommitmentTerm() throws InterruptedException {
        CommonSteps steps = new CommonSteps(driver);
        String value = steps.getTitleCommitmentTerm();
        Assert.assertEquals(value, order.getCommitmentTerm());
    }

    @Test
    public void checkValueAmountPrice() {
        CommonSteps steps = new CommonSteps(driver);
        String value = steps.getTitleValueAmount();
        Assert.assertEquals(value, order.getAmountRent());
    }


    @AfterTest
    public void stopDriver() {
        LocalDriver.stopWebDriver();
    }
}
