package keywords;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page_events.EventsBlogPage;
import page_objects.ObjectsBlogPage;

public class KeywordsValidacaoItensSubmenu {

    @Given("um usuário que clique no submenu {string}")
    public void umUsuárioQueCliqueNoSubmenu(String arg0) {
        EventsBlogPage home = new EventsBlogPage();
        home.openBlogPage();
        ObjectsBlogPage blog = new ObjectsBlogPage();
        blog.openBlogItem(arg0);
    }

    @Then("cada item deverá ter a tag {string} mostrado no card")
    public void cadaItemDeveráTerATagMostradoNoCard(String arg0) {
        EventsBlogPage page = new EventsBlogPage();
        page.assertTagNames(arg0);
    }

}
