package steps;

import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.PageOfCalculator;
import pages.PageOfResultsEnterData;
import pages.PageResultsOfSearch;




public class CommonSteps {
    private WebDriver driver;

    public CommonSteps(WebDriver driver) {
        this.driver = driver;
    }





    public MainPage pageSearching(String request) {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.searchingPage(request);
        return mainPage;
    }

    public PageResultsOfSearch getSearchingResult() {
        PageResultsOfSearch pageResultsOfSearch = new PageResultsOfSearch(driver);
        pageResultsOfSearch.getResultOfSearch();
        return pageResultsOfSearch;
    }

    public PageOfCalculator fillOrderForm(String value) {
        PageOfCalculator pageOfCalculator = new PageOfCalculator(driver);
        pageOfCalculator.setValueOfInstance(value);
        pageOfCalculator.selectOperationSystem();
        pageOfCalculator.selectMachineClass();
        pageOfCalculator.selectMachineType();
        pageOfCalculator.addGPU();
        pageOfCalculator.selectSelectLocalSSD();
        pageOfCalculator.selectDatacenterLocation();
        pageOfCalculator.selectValueCommitedUsage();
        pageOfCalculator.submitAddEstimate();


        return pageOfCalculator;
    }

    public String getTitleVirtualMachineClass() {
        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueMachineClass();
        String value = ParseString.getPartString(title);
        return value;
    }

    public String getTitleInstanceType() {
        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueInstanceType();
        String value = ParseString.getPartString(title);
        return value;
    }

    public String getTitleRegion() {
        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueRegion();
        String value = ParseString.getPartString(title);
        return value;
    }

    public String getTitleLocalSSD() {
        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueLocalSSD();
        String value= ParseString.parseLineForLastsWords(title);
        return value;
    }

    public String getTitleCommitmentTerm() {

        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueCommitmentTerm();
        String value = ParseString.getPartString(title);
        return value;

    }

    public  String getTitleValueAmount(){
        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueAmuont();
        String value = ParseString.parseLineForWordsOnMiddle(title);
        return value;
    }

}
