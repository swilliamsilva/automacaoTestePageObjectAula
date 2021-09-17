package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
// @FindBy Sintaxe: How = você escolhe como você quer mapear o elemento depois dele
//                  using = é o localizador, a maneira que deve ser buscado
//                  CSS = mapeamento, onde esta o que vocÊ vai buscar.
//  webElement = Variavel que armazena os elementos. Em seguida o nome.

    @FindBy(how = How.CSS, using = "#EncontreUmaLoja")
    private WebElement encontreUmaLoja;

    @FindBy(how = How.CSS, using = "#Duvidas")
    private WebElement duvidas;

    @FindBy(how = How.CSS, using = "#strBusca")
    private WebElement barraDePesquisa;

    @FindBy(how = How.CSS, using = "#btnOK")
    private WebElement botaoPesquisar;



    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    public void acessarEncontreUmaLoja(){
        encontreUmaLoja.click();
    }

    public void acessarDuvidas(){
        duvidas.click();
    }

    public void fazerPesquisa(String termoBusca){
        termoBusca = termoBusca.toLowerCase();

        barraDePesquisa.sendKeys(termoBusca);
        botaoPesquisar.click();
    }

