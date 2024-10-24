package gym

object GymCapacity {

    private const val MAX_VISITORS = 10

    var visitors: Int = 0
        private set

    fun enter(): Boolean {
        return if (visitors < MAX_VISITORS) {
            visitors++
            true
        } else {
            false
        }
    }
}