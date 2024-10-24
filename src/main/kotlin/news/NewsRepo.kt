package news

import kotlinx.coroutines.delay
import kotlin.random.Random

class NewsRepo {

    private suspend fun delayRandom() {
        delay(Random.nextLong(from = 400, until = 2000))
    }

    suspend fun getSportsNews(): List<News> {
        delayRandom()
        return List(5) { FakeNews() }
    }

    suspend fun getCelebrityNews(): List<News> {
        delayRandom()
        return List(4) { FakeNews() }
    }
}
