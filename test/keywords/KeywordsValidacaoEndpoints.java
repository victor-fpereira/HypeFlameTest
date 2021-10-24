package keywords;


import io.cucumber.java.en.Then;
import page_events.EventsBlogPage;
import page_objects.ObjectsBlogPage;

public class KeywordsValidacaoEndpoints {

    @Then("cada url deverá conter o {string}")
    public void cadaUrlDeveraConterO(String arg0) {
        EventsBlogPage home = new EventsBlogPage();
        home.openBlogPage();
        ObjectsBlogPage blog = new ObjectsBlogPage();
        blog.openBlogItem(arg0);
    }

}
