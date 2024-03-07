import ru.netology.*

fun main() {
    val a = "Анна"
    val b = "Богдан"
    val v = "Вероника"
    val g = "Григорий"
    val d = "Динара"
    val e = "Елисей"

    println("$a ${agoToText(50U)}")
    println("$b ${agoToText(1_270U)}")
    println("$v ${agoToText(40000U)}")
    println("$g ${agoToText(90_000U)}")
    println("$d ${agoToText(190_000U)}")
    println("$e ${agoToText(290_000U)}")

    println()

    val visaTransfer = printAboutTransfer(100_000, "Visa", 500_000)
    println("\tКомиссия: $visaTransfer")
    750
    val mirTransfer = printAboutTransfer(150_000, "Мир", 300_000)
    println("\tКомиссия: $mirTransfer")
    0
    val mcTransferS = printAboutTransfer(50_000, "Mastercard", 0)
    println("\tКомиссия: $mcTransferS")
    0
    val mcTransferM = printAboutTransfer(50_000, "Mastercard", 35_000)
    println("\tКомиссия: $mcTransferM")
    80
    val mcTransferL = printAboutTransfer(50_000, "Mastercard", 100_000)
    println("\tКомиссия: $mcTransferL")
    320
    val stopTransfer = printAboutTransfer(145_000, "Visa", 555_001)
    println("\tКомиссия: $stopTransfer")
    -1



}

fun printAboutTransfer(transferAmount: Int, cardType: String = CARD_TYPE_DEFAULT, prevTransfersAmount: Int = 0) : Int  {
    val fee = calcTransfer(transferAmount, cardType, prevTransfersAmount)
    println("""С карты $cardType за месяц совершено переводов на сумму $prevTransfersAmount.
        Перевод на сумму $transferAmount ${if (fee >= 0) "успешно осуществлен" else "не прошел"}         
    """.trimIndent())
    return fee
}