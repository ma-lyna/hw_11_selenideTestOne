import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;


public class SelenideTest extends TestBase {
    @DisplayName("Verify there is code example for JUnit")
    @Test
    void checkCodeExistence () {
        open("https://github.com/");
        $("input[name ='q']").setValue("selenide").submit();
        $(linkText("selenide/selenide")).click();
        $("#wiki-tab").click();
        $(withText("more pages")).click();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-content").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
