package PageObjectsFramework;

import Elements.Button;
import Elements.TextField;
import PageObjects.AmazonHomePageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageObjectsFramework {

    Button btnSearch;
    TextField txtFieldSearch;

    public AmazonHomePageObjectsFramework(WebDriver driver) {
        AmazonHomePageObjects page = PageFactory.initElements(driver, AmazonHomePageObjects.class);
        this.btnSearch = new Button(driver, page.getSearchButton());
        this.txtFieldSearch = new TextField(driver, page.getTextFieldSearch());
    }

    public Button getButtonSearch() {
        return this.btnSearch;
    }

    public TextField getTextFieldSearch() { return this.txtFieldSearch; }
}
