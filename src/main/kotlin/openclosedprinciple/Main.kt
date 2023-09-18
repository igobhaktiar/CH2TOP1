package openclosedprinciple

fun main() {
    val cc = CreditCardPayment()
    val edc = PaymentProcessor(cc)
    edc.proceed(amount = 20_000.0)

    val cash = CashPayment()
    val cashier = PaymentProcessor(cash)
    cashier.proceed(amount = 1_000_000.0)
}