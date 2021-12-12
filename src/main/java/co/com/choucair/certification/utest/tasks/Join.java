package co.com.choucair.certification.utest.tasks;


import co.com.choucair.certification.utest.userinterface.UtestJoinPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Join implements Task {
    public static Join onThePage(){
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinPage.JOIN_BUTTON));

    }
}
