package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;
    public BasePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

//    private final String tariff ="//div[@class = 'pull-right try-and-buy-btn-wrapper']/a";
    @FindBy(xpath = "//div[@class = 'pull-right try-and-buy-btn-wrapper']/a")
    private WebElement searchTariff;

    public void clickTariff(){
        driver.findElement((By) searchTariff).click();
    }
}
