package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.testng.Assert.assertTrue;


public class FlightBookingPage extends BasePage {

    @FindBy(id = "OneWay")
    private WebElement oneWayButton;
    @FindBy(id = "FromTag")
    private WebElement fromTagTextBox;
    @FindBy(id = "ui-id-1")
    private WebElement sourceSearchResults;
    @FindBy(id = "ToTag")
    private WebElement toTagTextBox;
    @FindBy(id = "ui-id-2")
    private WebElement destinationSearchResults;
    @FindBy(id = "DepartDate")
    private WebElement departDateSelector;
    @FindBy(id = "SearchBtn")
    private WebElement searchButton;
    @FindBy(className = "searchSummary")
    private WebElement searchSummaryText;

    public FlightBookingPage() {
        PageFactory.initElements(driver, this);
    }

    public void launchClearTrip() {
        driver.get("https://www.cleartrip.com/");
    }

    public void clickOneWayButton() {
        oneWayButton.click();
    }

    public void enterAndSelectSource(String source) {
        fromTagTextBox.clear();
        fromTagTextBox.sendKeys(source);
        sleepInSeconds(1);
        List<WebElement> originOptions = sourceSearchResults.findElements(By.tagName("li"));
        originOptions.get(0).click();
    }

    public void enterAndSelectDestination(String destination) {
        toTagTextBox.clear();
        toTagTextBox.sendKeys(destination);
        sleepInSeconds(1);
        List<WebElement> destinationOptions = destinationSearchResults.findElements(By.tagName("li"));
        destinationOptions.get(0).click();
    }

    public void enterDepartureDate(String date) {
        departDateSelector.sendKeys(date);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void verifyResultShown() {
        sleepInSeconds(3);
        assertTrue(searchSummaryText.isDisplayed(), "Result not displayed");
    }
}
