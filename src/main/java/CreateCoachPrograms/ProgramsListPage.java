package CreateCoachPrograms;

import static com.codeborne.selenide.Selenide.$x;

public class ProgramsListPage extends BasePage {

    public ProgramsListPage waitForPageLoad() {
        super.waitForPageLoad();
        return this;
    }

    public ProgramsListPage clickCreateNewProgramPatton() {
        $x("//a[@href='/coach/programs/create/choose-plan-type'][contains(text(),'Create new Program')]").click();
        return this;
    }

    public ProgramsListPage ckickOnCreateCustomProgramButton() {
        $x("//button[@data-gtm-id='coachcreatesbespoke']").click();
        return this;
    }

    public ProgramsListPage clickOnYesContinueButtonInAlert() {
        $x("//button[@class='btn btn-primary'][contains(text(),'Yes, continue')]").click();
        return this;
    }

    public ProgramsListPage ckickOnFixedLengthProgramInHeader() {
        $x("//li[@class='nav-item'][2]").click();
        return this;
    }

    public ProgramsListPage clickOnCreateProgram() {
        $x("//button[@data-gtm-id='coachcreatesfixed']").click();
        return this;
    }
}
