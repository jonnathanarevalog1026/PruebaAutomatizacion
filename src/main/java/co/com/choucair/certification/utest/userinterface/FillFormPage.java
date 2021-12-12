package co.com.choucair.certification.utest.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;


public class FillFormPage extends PageObject {
    public static final Target INPUT_FIRST = Target.the("Enter your name").located(By.id("firstName"));
    public static final Target INPUT_LAST = Target.the("Enter second name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Enter email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Select the month").located(By.xpath("//*[@id=\"birthMonth\"]/option[2]"));
    public static final Target SELECT_DAY = Target.the("Select the day").located(By.xpath("//*[@id=\"birthDay\"]/option[7]"));
    public static final Target SELECT_YEAR = Target.the("Select the year").located(By.xpath("//*[@id=\"birthYear\"]/option[12]"));
    public static final Target BUTTON_NEXT = Target.the("select the next page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target CITY = Target.the("Enter the city").located(By.xpath("//*[@id=\"city\"]"));
    public static final Target POSTAL = Target.the("Enter zip code").located(By.id("110111"));
    public static final Target COUNTRY = Target.the("Select the country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target BUTTON_NEXT2 = Target.the("Select the next page 2").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target BUTTON_NEXT3 = Target.the("Select the next page 3").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target PASSWORD = Target.the("Enter password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password").located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED = Target.the("select stay informed").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target TERMS_OF_USE = Target.the("select terms of use and conditions").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY_SECURITY_POLICY = Target.the("Select privacy security policy").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE = Target.the("Select complete setup").located(By.xpath("//*[@id=\"laddaBtn\"]"));
}
