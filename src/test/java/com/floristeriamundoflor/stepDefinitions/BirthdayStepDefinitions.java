package com.floristeriamundoflor.stepDefinitions;

import com.floristeriamundoflor.tasks.BirthdayTask;
import com.floristeriamundoflor.tasks.LoveTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BirthdayStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("that the user open the floristeriamundoflor and category birthday")
    public void thatTheUserOpenTheFloristeriamundoflorAndCategoryBirthday() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/")
        );
    }
    @When("the user do clikc in product and add to cart")
    public void theUserDoClikcInProductAndAddToCart() {
        theActorInTheSpotlight().attemptsTo(
                BirthdayTask.Birthday()

        );
    }
    @Then("the user can watch the produts and delete")
    public void theUserCanWatchTheProdutsAndDelete() {

    }
}
