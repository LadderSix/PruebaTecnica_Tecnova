package PruebaAutomatizacion_MR.steps;

import PruebaAutomatizacion_MR.constants.Constant;
import PruebaAutomatizacion_MR.constants.Navegador;
import PruebaAutomatizacion_MR.driverConfig.DriverContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import PruebaAutomatizacion_MR.pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class BackgroundSteps {

    @Given("Ingreso a la Web Abstracta")
    public void ingresoALaWebAbstracta() {
        DriverContext.setUp(Navegador.Chrome, Constant.URL_ABSTRACTRA_LOGIN);
        String url = DriverContext.getDriver().getCurrentUrl();
        assertEquals(Constant.URL_ABSTRACTRA_LOGIN, url);
    }
}
