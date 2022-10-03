package ru.alfabank.steps;

import com.codeborne.selenide.Driver;
import com.codeborne.selenide.WebDriverRunner;
import com.galenframework.page.Page;
import cucumber.api.java.ru.Тогда;
import entities.Repositories;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;
import ru.alfabank.steps.BaseMethods;
import ru.alfabank.steps.RoundUpSteps;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.switchTo;
import static java.lang.String.format;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import com.codeborne.selenide.Selenide;

@Slf4j
public class Testovoe1Steps {

    AkitaScenario akitaScenario = AkitaScenario.getInstance();

    BaseMethods baseMethods = new BaseMethods();
    RoundUpSteps roundUpSteps = new RoundUpSteps();

    @Тогда("открыта новая вкладка")
    public void openNewWindow() {
        Robot r = null;
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);
        switchTo().window(1);
    }

    @Тогда("выполнано нажати кнопки назад в браузере")
    public void goBack() {
        Selenide.back();
    }


}
