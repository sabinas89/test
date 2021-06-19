import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
    private WebDriver driver;

    @Before
    public void launchBrower() {

        System.setProperty("webdriver.chrome.driver", System.getenv("SE_HOME") + "\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void firstTest() {
        WebElement popUp = driver.findElement(By.id("L2AGLb"));
        popUp.click();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Sunflower");
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
        button.click();
        Assert.assertEquals("Sunflower - Szukaj w Google", driver.getTitle());

    }

    @After
    public void coolDown() {
       driver.quit();
    }

}
