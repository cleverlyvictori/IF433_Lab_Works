package oop_00000133646_cleverlyvictoriaurselialangitan.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 5000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 250.0))
    txRepo.add(Transaction("TX002", 500.0))
    txRepo.add(Transaction("TX003", 750.0))

    //CHECKPOINT 20
    println("\n=== DATA TRANSAKSI ===")
    txRepo.getAll().forEach {
        println("ID: ${it.id}, Amount: ${it.amount}")
    }
}