package oop_00000133646_cleverlyvictoriaurselialangitan.week13
import java.io.File

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

fun saveTrades(
    trades:List<TradeRecord>,
    path:String
){
    File(path)
        .printWriter()
        .use { writer ->
            trades.forEach { writer.println(it.toCsv())
            }
        }
}