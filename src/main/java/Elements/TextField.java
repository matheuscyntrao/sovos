package Elements;

import Interfaces.ITextField;

import Utils.JavaScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextField implements ITextField {

    private WebElement element;
    private WebDriver driver;
    private JavaScript js;

    public TextField(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
        this.js = new JavaScript(this.driver);
    }

    public void sendKeys(CharSequence keysToSend) {
        js.highlight(this.element);
        this.element.clear();
        this.element.sendKeys(keysToSend);
        js.removeHighlight(this.element);
    }

    public String getText() {
        return this.element.getText().replace("×","").trim();
    }

    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }

    public boolean isReadOnly() {
        if(this.element.getCssValue("readonly").equals("true")) {
            return true;
        }
        return false;
    }

    public String getAttribute(String property) {
        return this.element.getAttribute(property);
    }

}
