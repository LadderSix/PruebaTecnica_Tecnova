package PruebaAutomatizacion_MR.steps;

import PruebaAutomatizacion_MR.pages.CheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckOutSteps {

   CheckOutPage checkOutPage = new CheckOutPage();

    @And("Realizo el Checkout")
    public void realizoElCheckout() {
        checkOutPage.realizarCheckout();
    }

    @Then("Finalizo Existosamente la Compra")
    public void finalizoExistosamenteLaCompra() {

    }
}
