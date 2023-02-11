package verification

import com.codeborne.selenide.Condition.attribute
import com.codeborne.selenide.Selenide.`$`
import com.thoughtworks.gauge.Step

class VerifyTitle {
    @Step("ページタイトルが<title>であること")
    fun verifyTitle(title: String) {
        `$`("title").shouldHave(attribute("text", title))
    }
}