fun main(args: Array<String>){
    val bln = mapOf(
        "jan" to "januari",
        "feb" to "februari",
    "mar" to "maret",
    "apr" to "april",
      "mei" to "mei",
    "jun" to "juni",
    "jul" to "juni",
    "jul" to "juli",
        "ags" to "agustus",
    "sep" to "september",
    "okt" to "oktober",
    "nov" to "november",
    "des" to "desember",
    )
    println(bln)
    bln.forEach { value ->
        println("$value")
    }
    val blnini = bln["okt"]
    val birthmonth = bln["feb"]
    println("its {$blnini} now, aku lahir {$birthmonth}")
}