import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    private WebDriver driver;

    @Given("Browser is launched")
    public void browserIsLaunched() {
        System.setProperty("webdriver.chrome.driver", System.getenv("SE_HOME") + "\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("I enter search query")
    public void iEnterSearchQuery() {
        WebElement popUp = driver.findElement(By.id("L2AGLb"));
        popUp.click();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Sunflower");
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
        button.click();
    }

    @Then("I check title is correct")
    public void iCheckTitleIsCorrect() {
        Assert.assertEquals("Sunflower - Szukaj w Google", driver.getTitle());
        driver.quit();
    }


}
