package page_objects;

import engine.General;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ObjectsBlogPage {
    private final String HOME_BLOG = "https://hypeflame.blog/blog/";
    private final String SUBITEM_MENU = "https://hypeflame.blog/category/";
    private final General browser = new General();

    public ObjectsBlogPage() {
        PageFactory.initElements(browser.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//div[@class=\"entry-cats th-uppercase th-leading-none th-text-xs\"]")
    WebElement tag;

    public String getTextTag() {
        return tag.getText();
    }

    public void openBlogItem(String item) {
        browser.navigateToUrl(SUBITEM_MENU + item + '/');
    }

    public String getUrl() {
        return browser.getDriver().getCurrentUrl();
    }

    public void openBlogPage() {
        browser.navigateToUrl(HOME_BLOG);
    }

}
