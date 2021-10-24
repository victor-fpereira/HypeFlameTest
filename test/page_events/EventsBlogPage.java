package page_events;

import engine.General;
import page_objects.ObjectsBlogPage;
import page_objects.ObjectsHome;

import java.util.Objects;

public class EventsBlogPage extends General {

    public void assertTagNames(String tagName) {
        ObjectsBlogPage page = new ObjectsBlogPage();
        assert Objects.equals(tagName, page.getTextTag());
    }

    public void openBlogPage() {
        General general = new General();
        general.createDriver();
        ObjectsBlogPage blog = new ObjectsBlogPage();
        blog.openBlogPage();
    }

    public void assertEndpoints(String endpointName) {
        ObjectsBlogPage blogPage = new ObjectsBlogPage();
        assert blogPage.getUrl().contains(endpointName);
    }

}
