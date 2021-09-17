package testes;

import pageobjects.HomePage;
import pageobjects.SearchPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import setup.Driver;


public class Pesquisas {

    private WebDriver driver;

    @Before
    public void criarDriver(){
        Driver wdriver = new Driver();
        driver = wdriver.Webdriver();
    }

    @org.junit.Test
    public void fazerPesquisaVálida(){
        String termoBusca = "panela";

        HomePage homePage = new HomePage(driver);
        homePage.fazerPesquisa(termoBusca);

        SearchPage searchPage = new SearchPage(driver);
        boolean result = searchPage.verificarResultadoValido(termoBusca);

        Assert.assertTrue(result);
    }



    @After
    public void fecharDriver(){
        driver.close();
        driver.quit();
    }


}