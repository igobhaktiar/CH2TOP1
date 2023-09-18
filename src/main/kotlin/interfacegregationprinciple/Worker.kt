package interfacegregationprinciple

interface Eater {
    fun eat()
}

interface Worker {
    fun work()
}

class Engineer() : Worker, Eater{
    override fun work(){

    }

    override fun eat() {
        TODO("Not yet implemented")
    }
}


class Ai(): Worker{
    override fun work() {
        TODO("Not yet implemented")
    }

}