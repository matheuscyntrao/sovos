package PageObjects;

import Elements.Button;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePageObjects {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement textFieldSearch;

    @FindBy(id = "nav-search-submit-button")
    private WebElement buttonSearch;

    public WebElement getSearchButton() { return this.buttonSearch; }
    public WebElement getTextFieldSearch() { return this.textFieldSearch; }

}
