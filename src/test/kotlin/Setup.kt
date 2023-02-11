import com.codeborne.selenide.Configuration
import com.codeborne.selenide.WebDriverRunner
import com.thoughtworks.gauge.BeforeSuite
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URI

class Setup {
    @BeforeSuite
    fun beforeSuit() {
        val capabilities = DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "90.0");
        capabilities.setCapability("enableLog", true);
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        val driver = RemoteWebDriver(
            URI.create("http://localhost:4445/wd/hub").toURL(),
            capabilities
        );
        WebDriverRunner.setWebDriver(driver);

        Configuration.fastSetValue = true;
    }
}