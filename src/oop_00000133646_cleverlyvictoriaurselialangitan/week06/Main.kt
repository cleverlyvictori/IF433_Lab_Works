package oop_00000133646_cleverlyvictoriaurselialangitan.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("--> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")

    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    val lamp = SmartLamp("L1", "Ruang Tamu")
    val speaker = SmartSpeaker("S1", "Google Nest Dapur")
    val cctv = SmartCCTV("C1", "Ezviz Garasi")
    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)
    println("=== SECURITY MODE AKTIF ===")
    hub.activateSecurityMode()
    println("\n=== MEMATIKAN SEMUA PERANGKAT ===")
    hub.turnOffAllSwitches()
}