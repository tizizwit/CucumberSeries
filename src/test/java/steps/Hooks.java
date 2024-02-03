package steps;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.SeleniumDriver;

public class Hooks {

    public WebDriver driver;

    @Before
    public void setUp() {
        SeleniumDriver.setUpDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        // capturing screenshots
        if (scenario.isFailed()) {
            driver = SeleniumDriver.getDriver();
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        SeleniumDriver.tearDown();
    }

    /*

    @Before("@prod")
    public void setUp() {
        System.out.println("@Before hook - Launching browser");
    }

    @After("@staging")
    public void tearDown() {
        System.out.println("@After hook - Quit browser");
    }


        @BeforeAll
        public static void before_all() {
            System.out.println("@BeforeAll - Create DB Conn");
        }

        @AfterAll
        public static void after_all() {
            System.out.println("@AfterAll - Close DB Conn");
        }

    @Before(order = 0)
    public void setUp1() {
        System.out.println("@Before hook - Launching browser 1");
    }

    @Before(order = 1)
    public void setUp2() {
        System.out.println("@Before hook - Launching browser 2");
    }

    @After(order = 0)
    public void tearDown1() {
        System.out.println("@After hook - Quit browser 1");
    }

    @After(order = 1)
    public void tearDown2() {
        System.out.println("@After hook - Quit browser 2");
    }

    @BeforeStep
    public static void before_step() {
        System.out.println("@BeforeStep - adding a log");
    }

    @AfterStep
    public static void after_step() {
        System.out.println("@AfterStep - deleting a log");
    }
*/

}
