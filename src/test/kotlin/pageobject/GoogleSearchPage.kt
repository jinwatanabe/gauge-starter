package pageobject

import com.codeborne.selenide.Selenide.open
import com.thoughtworks.gauge.Step
import org.openqa.selenium.By
import com.codeborne.selenide.Selenide.`$`
import com.thoughtworks.gauge.Table
import com.thoughtworks.gauge.TableRow



class GoogleSearchPage {
    private val searchWord = `$`(By.name("q"))

    @Step("Google検索ページを開く")
    fun openPage() {
        return open("https://www.google.com/");
    }

    @Step("<text>と入力し、検索を行う")
    fun search(text: String) {
        searchWord.setValue(text).pressEnter();
    }

    @Step("<table>の検索ワードで検索し、公式ページを開く")
    fun searchOfficialPage(table: Table) {
        val rows = table.tableRows
        val resultPage = GoogleSearchResultPage()
        for (row: TableRow in rows) {
            val text = row.getCell("search_word")
            openPage()
            searchWord.setValue(text).pressEnter();
            resultPage.clickSearchResult(row.getCell("title"))
        }
    }

}