import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Githubtest {
    @Test
    void page() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body").shouldHave(text("Soft assertions"));
        $("#wiki-body").$(byText("Soft assertions")).click();
        $("#wiki-wrapper h1").shouldHave(text("SoftAssertions"));
        $("#wiki-body").shouldHave( text("JUnit5"),
                text("SoftAssertsExtension"),
                text("@ExtendWith({SoftAssertsExtension.class})"));
    }
}
