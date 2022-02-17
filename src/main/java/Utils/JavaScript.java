package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScript {

    WebDriver driver;
    JavascriptExecutor js;

    public JavaScript(WebDriver driver) {
        this.js =(JavascriptExecutor) driver;
    }

    private void execute(String javascriptCommand, WebElement element) {
        js.executeScript(javascriptCommand, element);
    }

    public void highlight(WebElement element) {
        execute("arguments[0].style='border: 2px solid red;'", element);
    }

    public void removeHighlight(WebElement element) {
        execute("arguments[0].style='border: 0px';", element);
    }

}
