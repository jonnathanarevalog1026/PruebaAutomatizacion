package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.FillFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Fill implements Task {

    public Fill(String strName, String strLastName, String strEmail) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }

    private String strName;
    private String strLastName;
    private String strEmail;

    public static Fill onThePage(String strName, String strLastName, String strEmail) {
        return Tasks.instrumented(Fill.class,strName, strLastName,strEmail );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               // Enter.theValue(strName).into(FillFormPage.INPUT_FIRST),
                Enter.theValue(strLastName).into(FillFormPage.INPUT_LAST),
                Enter.theValue(strEmail).into(FillFormPage.INPUT_EMAIL),
                Click.on(FillFormPage.SELECT_MONTH),
                Click.on(FillFormPage.SELECT_DAY),
                Click.on(FillFormPage.SELECT_YEAR),
                Click.on(FillFormPage.BUTTON_NEXT),
                Click.on(FillFormPage.CITY),
                Click.on(FillFormPage.BUTTON_NEXT2),
                Click.on(FillFormPage.BUTTON_NEXT3),
               // Enter.theValue("J0NN4Th4N1026").into(FillFormPage.PASSWORD),
                //Enter.theValue("J0NN4Th4N1026").into(FillFormPage.CONFIRM_PASSWORD),
                Click.on(FillFormPage.STAY_INFORMED),
                Click.on(FillFormPage.TERMS_OF_USE),
                Click.on(FillFormPage.PRIVACY_SECURITY_POLICY),
                Click.on(FillFormPage.BUTTON_COMPLETE)
                );



    }
}
