package oop_00000133646_cleverlyvictoriaurselialangitan.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv():String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line:String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            parts[0].toInt(),
            parts[1],
            parts[2],
            parts[3].toDouble(),
            parts[4].toDouble()
        )
    } catch(e:Exception){
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades:List<TradeRecord>, path:String){
    File(path)
        .printWriter()
        .use { writer ->
            trades.forEach { writer.println(it.toCsv())
            }
        }
}

fun loadTrades(path:String): List<TradeRecord>{
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch(e:FileNotFoundException){
        println("File tidak ditemukan")
        emptyList()
    }
}

fun main(){
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 500.0, 45.8),
        TradeRecord(2, "ETHUSDT", "Short", 300.0, -12.3),
        TradeRecord(3, "SOLUSDT", "Long", 200.0, 18.0)
    )
    saveTrades(trades, "crypto_trades.csv")

    File("crypto_trades.csv")
        .appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
}