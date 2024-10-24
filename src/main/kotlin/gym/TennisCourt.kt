package gym

object TennisCourt {

    private const val PRICE = 1

    fun enter(money: Int): Boolean {
        return if (GymCapacity.enter() && money == PRICE) {
            GymSafe.save(money)
            true
        } else {
            false
        }
    }
}