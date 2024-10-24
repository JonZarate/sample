package gym

object GymSafe {

    var savings: Int = 0
        private set

    fun save(amount: Int) {
        savings += amount
    }
}