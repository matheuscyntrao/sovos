package Elements;

import Interfaces.IButton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button implements IButton {

    public WebDriver driver;
    public WebElement element;

    public Button(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }

    public void click() {
        this.element.click();
    }

    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }

}
