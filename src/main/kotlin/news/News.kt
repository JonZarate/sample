package news

data class News(
    val headline: String,
    val body: String,
)

fun FakeNews() = News(headline = "Headline", body = "Long news body")