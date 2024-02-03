package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.testng.Assert;
import page.objects.HomePage;
import page.objects.NewCarsPage;
import page.objects.ToyotaCarPage;
import pages.base.BasePage;
import pages.base.CarBase;
import utils.SeleniumDriver;

public class CarWaleSteps {

    HomePage home = new HomePage();
    NewCarsPage car;
    ToyotaCarPage toyota;

    @Given("user navigates to carwale website")
    public void user_navigates_to_carwale_website() {
        SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testsiteurl"));
    }

    @When("user mouseover to newcars")
    public void user_mouseover_to_newcars() {
        home.mouseOverNewCars();
    }

    @Then("user clicks on Findnewcars")
    public void user_clicks_on_findnewcars() {
        car = home.clickFindNewCars();
    }

    @And("user clicks on {string} car")
    public void user_clicks_on_car(String carBrand) {
        switch(carBrand) {
            case "Toyota":
                toyota = car.gotoToyota();
                break;
            case "Kia":
                car.gotoKia();
                break;
            case "BMW":
                car.gotoBMW();
                break;
            case "Hyundai":
                car.gotoHyundai();
                break;
            default:
                // code block
        }

    }

    @And("user validates carTitle as {string}")
    public void user_validates_car_title(String carTitle) {
        Assert.assertTrue(BasePage.carBase.getCarTitle().equals(carTitle));
    }

}
