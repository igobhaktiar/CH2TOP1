package liskovsubstitutionprinciple

abstract class Car{
    abstract fun performance()
    abstract fun engine()

}

class Toyota(features: List<String>) : Car() {
    override fun performance() {

    }

    override fun engine() {

    }
}

class Tesla(autonomous: Boolean, features: List<String>) : Car() {
    override fun performance() {

    }

    override fun engine() {

    }
}