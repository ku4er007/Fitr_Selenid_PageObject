package CreateCoachPrograms;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.*;

public class CreateProgramForm extends BasePage{

    SelenideElement switcherElement = $x("//div[@class='switcher']");
    SelenideElement overviewElement = $x("//div[@class='details']");

    public CreateProgramForm waitForPageLoad() {
        super.waitForPageLoad();
        return this;
    }


    public CreateProgramForm enterTitileOfProgram() {
        $x("//input[@placeholder='[Edit] Individualised Programming']").val("some test Title");
        return this;
    }

    public CreateProgramForm clickOnRequiredExperienceSelector() {
        $x("//button[@class='rate__star'][4]").click();
        return this;
    }

    public CreateProgramForm enterDailyTrainingTime() {
        $x("//input[@id='average_duration']").val("20");
        return this;
    }

    public CreateProgramForm enterPerWeekInputData() {
        $x("//input[@id='weeks_duration']").val("7");
        return this;
    }

    public CreateProgramForm enterSessionsPerDayInput() {
        $x("//input[@id='sections_duration']").val("3");
        return this;
    }

    public CreateProgramForm enterDescriptionProgram() {
        $x("//textarea[@rows='2']").val("Some text text program descroption");
        return this;
    }

    public CreateProgramForm clickOnStep2Button() {
        $x("//button[@class='tab-link step-link']").click();
        return this;
    }

    public CreateProgramForm clickOnGotItButtoniInAlert() {
        $x("//button[@class='btn btn-primary'][contains(text(),'Got It')]").click();
        return this;
    }

    public CreateProgramForm switchToIntercomeElementAndCloseIt() {
        switchTo().frame($x("//iframe[@name='intercom-tour-frame']"));
        $x("//span[@aria-label='Close']").click();
        return this;
    }

    public CreateProgramForm switchToPerentPage() {
        switchTo().parentFrame();
        return this;
    }

    public CreateProgramForm clickOnPublishProgramButton() {
        $x("//button[@class='btn btn-primary'][contains(text(),'Publish the Program')]").click();
        return this;
    }

    public CreateProgramForm clickOnPublishMyProgram() {
        $x("//button[@class='btn btn-primary'][contains(text(),'Publish my Program')]").click();
        return this;
    }

    public CreateProgramForm clickOnNextButton() {
        $x("//button[@data-gtm-id='coachprogressespastsharing']").click();
        return this;
    }

    public CreateProgramForm clickOnStartProgramingButton() {
        $x("//a[@class='btn btn-primary m-auto m-md-0']").click();
        return this;
    }

    public CreateProgramForm closeAlertWithGotItButton() {
        $x("//button[@class='close']").click();
        return this;
    }

    public CreateProgramForm clickOnProgramsElementInHeader() {
        $x("//a[@class='nav-link active']").click();
        return this;
    }


//    public CreateProgramForm equalsCurrentUrl() {
//
//    }

    public CreateProgramForm clickOnUserAvatar() {
        $x("//div[@class='avatar sm2 circle avatar-empty fit_cover']").click();
        return this;
    }

    public CreateProgramForm clickOnLogOutButton() {
        $x("//button[@class='btn btn-outline-danger']").click();
        return this;
    }

    public CreateProgramForm scrollPageDown() {
        actions().moveToElement(switcherElement).perform();
        return this;
    }

    public CreateProgramForm scrollPageDownToPublicProgramButton() {
        actions().moveToElement(overviewElement).perform();
        return this;
    }

    public CreateProgramForm enterFixedLengthTitle() {
        $x("//input[@placeholder='[Edit] Fixed Length Programming']").val("Test Test Test Title");
        return this;
    }

    public CreateProgramForm clickOnStep3Button() {
        $x("//button[@class='tab-link step-link']").click();
        return this;
    }

    public CreateProgramForm clickOnFinishButton() {
        $x("//button[@class='btn btn-primary'][contains(text(),'Finish')]").click();
        return this;
    }

    public CreateProgramForm enterGroupCalendarProgrammingTitle() {
        $x("//input[@placeholder='[Edit] Group Calendar Programming']").val("Test Test Test Title Group Calendar Programming Title");
        return this;
    }

    public CreateProgramForm clickOnProgramsElementInHeaderByHref() {
        $x("//a[@href='/coach/programs']").click();
        return this;
    }

    public CreateProgramForm enterSession1Day1ProgrammingTitle() {
        $x("//input[@placeholder='[Edit] Session 1, Day 1 Programming']").val("Test Test Test Title Session 1, Day 1 Programming");
        return this;
    }
}
