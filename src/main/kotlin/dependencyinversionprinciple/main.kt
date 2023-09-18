package dependencyinversionprinciple

fun main (){
    val light = LightBulb()
    val switchButton = Switch(light)
    switchButton.operate()
}