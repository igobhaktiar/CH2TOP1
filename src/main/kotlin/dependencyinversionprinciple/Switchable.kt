package dependencyinversionprinciple

import java.awt.GraphicsDevice

interface Switchable {
    fun turnOn()
    fun turnOff()
}

class LightBulb: Switchable{
    override fun turnOff() {
        TODO("Not yet implemented")
    }

    override fun turnOn() {
        TODO("Not yet implemented")
    }
}

class Switch(private val device: Switchable){
    fun operate(){
        device.turnOff()
    }
}