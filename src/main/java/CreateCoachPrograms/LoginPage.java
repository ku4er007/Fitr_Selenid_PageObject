package CreateCoachPrograms;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BasePage {

    public LoginPage waitForPageLoad() {
        super.waitForPageLoad();
        return this;
    }

    public LoginPage sendEmailCredentials() {
        $x("//input[@id='email']").val("ku4er007@gmail.com");
        return this;
    }

    public LoginPage sendPasswordCredentials() {
        $x("//input[@name='current-password']").val("vndzqh2sgn");
        return this;
    }

    public LoginPage cliskLoginButton() {
        $x("//button").click();
        return this;
    }
}
