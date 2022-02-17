package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver ChromeDriverWindows32() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\java\\Driver\\chromedriver.exe");
        return new ChromeDriver();
    }

}
