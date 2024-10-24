package gym

object SwimmingPool {

    private const val PRICE = 2

    fun enter(money: Int): Boolean {
        return if (GymCapacity.enter() && money == PRICE) {
            GymSafe.save(money)
            true
        } else {
            false
        }
    }
}