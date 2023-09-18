package openclosedprinciple

class CreditCardPayment :PaymentMethod {
    override fun proceedPayment(amount: Double) {
        // action request to payment service
        // visa
        // mastercard
        // jcb
        // american express
        // etc
    }
}