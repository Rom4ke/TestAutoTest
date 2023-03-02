package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class WikiTest {
    @Test
    @Tag("wiki")
    public void openAllHrefs(){
        Selenide.open("https://ru.wikipedia.org/wiki/Java");

    }

}
