package oop_00000133646_cleverlyvictoriaurselialangitan.week09

fun main () {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.3, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 0.0, "CLOSED"),
        TradeLog("XRPUSDT", "LONG", 10, 4.5, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 30, -2.1, "OPEN")
    )
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }
    val winningTrades = closedTrades
        .filter { it.roe > 0 }
    val losingTrades = closedTrades
        .filter { it.roe <= 0 }
}