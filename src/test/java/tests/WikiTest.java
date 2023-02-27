package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class WikiTest {
    @Test

    public void openAllHrefs(){
        Selenide.open("https://ru.wikipedia.org/wiki/Java");

    }

}
