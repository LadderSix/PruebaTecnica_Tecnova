package PruebaAutomatizacion_MR.pages;

import PruebaAutomatizacion_MR.driverConfig.DriverContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

    private WebDriver driver;
    public static final Logger log = LogManager.getLogger(CheckOutPage.class);

    public CheckOutPage() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver,this);
    }


    @FindBy(xpath = "")
    private WebElement btn;


    public void realizarCheckout() {

    }
}
