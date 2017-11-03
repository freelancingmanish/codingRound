import org.testng.annotations.Test;
import pages.FlightBookingPage;


public class FlightBookingTests extends TestManager{

    @Test
    public void testThatResultsAppearForAOneWayJourney() {
        FlightBookingPage flightBookingPage = new FlightBookingPage();
        flightBookingPage.launchClearTrip();
        flightBookingPage.clickOneWayButton();
        flightBookingPage.enterAndSelectSource("BLR");
        flightBookingPage.enterAndSelectDestination("IXR");
        flightBookingPage.enterDepartureDate("25/12/2017");
        flightBookingPage.clickSearchButton();
        flightBookingPage.verifyResultShown();
    }
}
