package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    driver WebDriver privado;

    @FindBy (how = How.CSS, using = ".nm-product-name> a> span")
    Lista privada <WebElement> resultados;


    public SearchPage (driver WebDriver) {
        PageFactory.initElements (driver, este);
        this.driver = driver;
    }

    public boolean verificarResultadoValido (String termoBusca) {

        for (int i = 0; i <resultados.size (); i ++) {
            Resultado da string = resultados.get (i) .getText (). ToLowerCase ();

            if (result.contains (termoBusca)) {
                return true;
            }
        }


        retorna falso;

    }

}