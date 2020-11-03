package FitrCreateCoachProgramsTests;

import CreateCoachPrograms.CreateProgramForm;
import CreateCoachPrograms.LoginPage;
import CreateCoachPrograms.ProgramsListPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class FitrCreateCoachProgramsTests {
    LoginPage loginPage;
    ProgramsListPage programsListPage;
    CreateProgramForm createProgramForm;

    @BeforeClass
    public void startUp() {
        Configuration.baseUrl = "https://dev.fitr.training/onboarding/sign_in";
        Configuration.startMaximized = true;
        open("");
        loginPage = new LoginPage();
        programsListPage = new ProgramsListPage();
        createProgramForm = new CreateProgramForm();
    }

    @Test
    public void positiveCreateCustomCoachProgramTest() {
        loginPage.waitForPageLoad()
                .sendEmailCredentials()
                .sendPasswordCredentials()
                .cliskLoginButton();
        programsListPage.waitForPageLoad()
                .clickCreateNewProgramPatton()
                .waitForPageLoad()
                .ckickOnCreateCustomProgramButton()
                .waitForPageLoad()
                .clickOnYesContinueButtonInAlert()
                .waitForPageLoad();
        createProgramForm
                .enterTitileOfProgram()
                .scrollPageDown()
                .clickOnRequiredExperienceSelector()
                .enterDailyTrainingTime()
                .enterPerWeekInputData()
                .enterSessionsPerDayInput()
                .enterDescriptionProgram()
                .clickOnStep2Button()
                .clickOnGotItButtoniInAlert()
                .switchToIntercomeElementAndCloseIt()
                .switchToPerentPage()
                .scrollPageDownToPublicProgramButton()
                .clickOnPublishProgramButton()
                .clickOnPublishMyProgram()
                .clickOnNextButton()
                .clickOnStartProgramingButton()
                .waitForPageLoad()
                .closeAlertWithGotItButton()
                .clickOnProgramsElementInHeader()
                .clickOnUserAvatar()
                .clickOnLogOutButton();

    }

    @Test
    public void positiveCreateFixedLengthCoachProgramTest() {
        loginPage.waitForPageLoad()
                .sendEmailCredentials()
                .sendPasswordCredentials()
                .cliskLoginButton();
        programsListPage.waitForPageLoad()
                .clickCreateNewProgramPatton()
                .waitForPageLoad()
                .ckickOnFixedLengthProgramInHeader()
                .clickOnCreateProgram()
                .waitForPageLoad();
        createProgramForm
                .enterFixedLengthTitle()
                .scrollPageDown()
                .clickOnRequiredExperienceSelector()
                .enterDailyTrainingTime()
                .enterPerWeekInputData()
                .enterSessionsPerDayInput()
                .enterDescriptionProgram()
                .clickOnStep2Button()
                .clickOnGotItButtoniInAlert()
                .switchToIntercomeElementAndCloseIt()
                .switchToPerentPage()
                .clickOnStep3Button()
                .switchToIntercomeElementAndCloseIt()
                .switchToPerentPage()
                .scrollPageDownToPublicProgramButton()
                .clickOnPublishProgramButton()
                .clickOnPublishMyProgram()
                .clickOnNextButton()
                .clickOnButton()
                .waitForPageLoad()
                .clickOnProgramsElementInHeader()
                .clickOnUserAvatar()
                .clickOnLogOutButton();
    }
}
