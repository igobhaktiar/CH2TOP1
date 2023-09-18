package openclosedprinciple

class CashPayment:PaymentMethod {
    override fun proceedPayment(amount: Double) {
        // periksa uang asli atau palsu
        // dan ada kembalian atau tidak
    }
}