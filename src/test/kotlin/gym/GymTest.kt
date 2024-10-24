package gym

import org.junit.jupiter.api.Assertions.assertFalse
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class GymTest {

    @BeforeTest
    fun setup() {
        Gym.swimmingPool = SwimmingPool
        Gym.tennisCourt = TennisCourt
    }

    @Test
    fun `when price is not enough, capacity is 0 and savings is 0`() {
        val resultSwimmingPool = Gym.enterSwimmingPool(0)
        val resultTennisCourt = Gym.enterTennisCourt(0)

        assertFalse(resultSwimmingPool)
        assertFalse(resultTennisCourt)
        assertEquals(0, GymCapacity.visitors)
        assertEquals(0, GymSafe.savings)
    }
}