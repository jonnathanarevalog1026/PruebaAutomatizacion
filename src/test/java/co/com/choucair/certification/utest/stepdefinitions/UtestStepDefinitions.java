package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.UtestData;
import co.com.choucair.certification.utest.tasks.Fill;
import co.com.choucair.certification.utest.tasks.Join;
import co.com.choucair.certification.utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.certification.utest.tasks.Fill.onThePage;

public class UtestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Jonathan wants to register on the UTest page\\.$")


    public void jonathanWantsToRegisterOnTheUTestPage() {
        OnStage.theActorCalled("Jonnathan").wasAbleTo(OpenUp.thePage(),(Join.onThePage()));

    }

    @When("^you fill out the registration form\\.$")
    public void youFillOutTheRegistrationForm(List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("Jonnathan").attemptsTo(onThePage(utestData.get(0).getStrName(),utestData.get(0).getStrLastName(),utestData.get(0).getStrEmail()));

        Fill.onThePage(utestData.get(0).getStrName(),utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail());
    }


    @Then("^register on the page\\.$")
    public void registerOnThePage() {

    }
}
