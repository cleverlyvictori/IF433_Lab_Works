package oop_00000133646_cleverlyvictoriaurselialangitan.week13

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv():String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line:String): TradeRecord? {
    val parts = line.split(",")
    return TradeRecord(parts[0].toInt(), parts[1], parts[2], parts[3].toDouble(), parts[4].toDouble())
}