package keywords;

import engine.General;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page_events.EventsBlogPage;
import page_events.EventsHome;

public class KeywordsPesquisaItens {

    @Given("um usuário que pesquise um item {string} usando a busca")
    public void umUsuárioQuePesquiseUmItemUsandoABusca(String arg0) {
        EventsHome home = new EventsHome();
        home.openHomePage();
        home.searchItem(arg0);
    }

    @Then("a página deverá mostrar itens que tenham o termo de pesquisa {string}")
    public void aPáginaDeveráMostrarItensQueTenhamOTermoDePesquisa(String arg0) {
        EventsBlogPage page = new EventsBlogPage();
        page.assertTagNames(arg0);
    }


    @After
    public void encerraNavegador() {
        General general = new General();
        general.closeAllBrowsers();
    }

}
