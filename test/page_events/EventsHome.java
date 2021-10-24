package page_events;

import engine.General;
import page_objects.ObjectsHome;

public class EventsHome {

    public void searchItem(String text) {
        ObjectsHome home = new ObjectsHome();
        home.clickSearchIcon();
        home.txtSearchInputText(text);
        home.btnSearchIconFromInput();
    }

    public void openHomePage(){
        General general = new General();
        general.createDriver();
        ObjectsHome home = new ObjectsHome();
        home.openMainPage();
    }
}
