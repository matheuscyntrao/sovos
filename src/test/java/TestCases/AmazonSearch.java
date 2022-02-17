package TestCases;

import Driver.Driver;
import Tasks.AmazonHomeTasks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AmazonSearch {

    WebDriver driver;
    AmazonHomeTasks amazonHomeTasks;

    @Before
    public void init() throws InterruptedException {
        this.driver = Driver.ChromeDriverWindows32();
        this.driver.get("https://www.amazon.com.br/");
        this.amazonHomeTasks = new AmazonHomeTasks(this.driver);
    }

    @Test
    public void SearchForSometing() throws InterruptedException {
        this.amazonHomeTasks.doSearch("computador");
    }

    @After
    public void tearDown() {
        this.driver.close();
    }
}
