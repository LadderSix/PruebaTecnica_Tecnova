package PruebaAutomatizacion_MR.pages;

import PruebaAutomatizacion_MR.driverConfig.DriverContext;
import PruebaAutomatizacion_MR.utils.MetodosGenericos;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    private WebDriver driver;
    public static final Logger log = LogManager.getLogger(ShoppingCartPage.class);

    public ShoppingCartPage() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver,this);
    }


    @FindBy(xpath = "(//button[@title=\"Remove\"])[1]")
    private WebElement btnEliminarProducto;

    @FindBy(xpath = "//span[contains(text(),'Checkout')]")
    private WebElement btnCheckout;

    @FindBy(xpath = "")
    private WebElement shoppingCart;


    public void eliminaItem(){
        MetodosGenericos.esperar(2);
        btnEliminarProducto.click();
        System.out.println("Item Eliminado!");
    }

    public void irAlCheckout(){
        MetodosGenericos.visualizarObjeto(btnCheckout, 20);

    }
}
