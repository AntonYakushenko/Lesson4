import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class Difference {
    @Test
    void SearchSelectors(){
        open("https://github.com/selenide/selenide");
        //Вариант 1
        $("h1 div").should(exist);
        sleep(5000);
    }

    @Test
    void SearchAnySelectors(){
        open("https://github.com/selenide/selenide");
        //Вариант 2
        $("h1").$("div").should(exist);
        sleep(5000);
    }
}