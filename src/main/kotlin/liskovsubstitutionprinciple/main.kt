package liskovsubstitutionprinciple

fun main(){
    val yaris = Toyota(listOf("TSS"))
    yaris.performance()

    val model3 = Tesla(autonomous = true, features = listOf(""))
    model3.performance()
    model3.engine()
}