package Tasks;

import PageObjectsFramework.AmazonHomePageObjectsFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AmazonHomeTasks {

    WebDriver driver;
    AmazonHomePageObjectsFramework amazonHomePageObjectsFramework;

    public AmazonHomeTasks(WebDriver driver) {
        this.driver = driver;
        this.amazonHomePageObjectsFramework = new AmazonHomePageObjectsFramework(this.driver);
    }

    public void doSearch(String textSearch) throws InterruptedException {
        this.amazonHomePageObjectsFramework.getTextFieldSearch().sendKeys(textSearch);
        this.amazonHomePageObjectsFramework.getButtonSearch().click();
    }


}
