package oop_00000133646_cleverlyvictoriaurselialangitan.week14

import java.io.File

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName,$finalPrice,$customerType\n")
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.printWriter().use { out ->
            out.println("$itemName,$finalPrice,$customerType")
        }
    }
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface PricingStrategy {
    val customerType: String
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override val customerType: String = "REGULAR"
    override fun calculate(price: Double): Double = price
}

class VipPricing : PricingStrategy {
    override val customerType: String = "VIP"
    override fun calculate(price: Double): Double = price * 0.90 // Diskon 10%
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy) {
        val finalPrice = pricingStrategy.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, pricingStrategy.customerType)
        notifier.sendNotification(item
}

fun main() {
    val csvRepo = CsvOrderRepository()
    val emailService = EmailNotifier()
    val orderProcessor = SafeOrderProcessor(csvRepo, emailService)
    println("=== Eksekusi Pesanan VIP ===")
    orderProcessor.processOrder("Laptop Gaming", 15000000.0, VipPricing())

    println("\n=== Eksekusi Pesanan Regular ===")
    orderProcessor.processOrder("Keyboard", 850000.0, RegularPricing())
}