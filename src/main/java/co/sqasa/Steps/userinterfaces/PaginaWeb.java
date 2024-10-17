package co.sqasa.Steps.userinterfaces;


import net.serenitybdd.core.pages.PageObject;

public class PaginaWeb extends PageObject {
    public PaginaWeb(){
        super();
        String url = System.getenv("url");
        setDefaultBaseUrl(url);
    }

}
