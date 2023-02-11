import com.codeborne.selenide.WebDriverRunner
import com.thoughtworks.gauge.AfterSuite

class Teardown {
    @AfterSuite
    fun afterSuite() {
        WebDriverRunner.closeWebDriver();
    }
}