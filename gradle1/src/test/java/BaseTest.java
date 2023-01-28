import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.WebDriverFactory;

public class BaseTest {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver.get("https://megogo.net/ua/tv/channels/1420191-stb-hd-online.html");
    }
    @AfterMethod
    public void Out(){
        driver.quit();
    }
}
