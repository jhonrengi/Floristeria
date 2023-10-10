package com.floristeriamundoflor.stepDefinitions;

import com.floristeriamundoflor.questions.ValidationName;
import com.floristeriamundoflor.tasks.LoveTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoveStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("that the user open the floristeriamundoflor and category love")
    public void thatTheUserOpenTheFloristeriamundoflorAndCategoryLove() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/")
        );
    }
    @When("the user do clikc in products and add to cart")
    public void theUserDoClikcInProductsAndAddToCart() {
        theActorInTheSpotlight().attemptsTo(
                LoveTask.Love()

        );
    }
    @Then("the user can watch the produts.")
    public void theUserCanWatchTheProduts() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidationName.from(), Matchers.equalTo(true)
                )

        );
    }
}
