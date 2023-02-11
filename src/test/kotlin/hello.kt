import com.thoughtworks.gauge.Step

class HelloGitHubActions {

    @Step("Hello, GitHub Actionの文字列を出力する")
    fun hello() {
        println("Hello, GitHub Actions")
    }
}