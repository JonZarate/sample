package gym

object Gym {

    lateinit var swimmingPool: SwimmingPool
    lateinit var tennisCourt: TennisCourt

    fun enterSwimmingPool(money: Int) = swimmingPool.enter(money)

    fun enterTennisCourt(money: Int) = tennisCourt.enter(money)
}