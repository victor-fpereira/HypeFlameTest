package page_objects;

import engine.General;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ObjectsHome {
    private final String HOME_URL = "https://hypeflame.blog/";
    private final General browser = new General();

    @FindBy(how = How.ID, using = "header-search")
    WebElement btnSearchIcon;

    public void clickSearchIcon() {
        btnSearchIcon.click();
    }

    @FindBy(how = How.XPATH, using = "//input[@placeholder=\"Pesquise aqui...\"]")
    WebElement txtSearchInputText;

    public void txtSearchInputText(String text) {
        txtSearchInputText.sendKeys(text);
    }

    @FindBy(how = How.XPATH, using = "//button[@type=\"submit\"]")
    WebElement btnSearchIconFromInput;

    public void btnSearchIconFromInput() {
        btnSearchIconFromInput.click();
    }

    public void openMainPage() {
        browser.navigateToUrl(HOME_URL);
    }

    public ObjectsHome() {
        PageFactory.initElements(browser.getDriver(), this);
    }
}
