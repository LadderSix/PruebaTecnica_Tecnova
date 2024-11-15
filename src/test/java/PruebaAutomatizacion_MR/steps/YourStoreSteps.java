package PruebaAutomatizacion_MR.steps;

import PruebaAutomatizacion_MR.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class YourStoreSteps {

    MyAccountPage myAccountPage = new MyAccountPage();

    @And("Ingresar a Seccion YourStore")
    public void ingresarASeccionYourStore() {
        myAccountPage.ingresoSeccionYourStore();
    }

    @And("Agrego productos al carrito")
    public void agregoXProductosAMiCarrito() {
        myAccountPage.agregoItemMacbook();
        myAccountPage.agregoAlCarrito();

        myAccountPage.menuHome();

        myAccountPage.agregoItemCamara();
        myAccountPage.agregoAlCarrito();

        myAccountPage.menuHome();

        myAccountPage.agregoItemMonitor();
        myAccountPage.agregoAlCarrito();

        myAccountPage.irAlCarrito();

    }
}
