package pageobject

import com.codeborne.selenide.Condition.matchText
import com.codeborne.selenide.Selenide.`$$`
import com.thoughtworks.gauge.Step

class GoogleSearchResultPage {
    private val searchResult = `$$`(".g h3")

   @Step("検索結果の<title>をクリックする")
   fun clickSearchResult(title: String) {
       searchResult.find(matchText("^" + title + "$")).click()
   }
}