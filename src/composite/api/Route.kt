package composite.api

class Route : Stretch {

    private val stretches: MutableList<Stretch> = mutableListOf()

    fun add(stretch: Stretch) {
        this.stretches.add(stretch)
    }

    fun remove(stretch: Stretch) {
        this.stretches.remove(stretch)
    }

    override fun print() {
        for (s in this.stretches) {
            s.print()
        }
    }
}