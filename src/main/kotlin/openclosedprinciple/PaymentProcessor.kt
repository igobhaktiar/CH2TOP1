package openclosedprinciple

import java.time.temporal.TemporalAmount

class PaymentProcessor (private val paymentMethod: PaymentMethod) {
    fun proceed(amount: Double){
        paymentMethod.proceedPayment(amount)
    }
}