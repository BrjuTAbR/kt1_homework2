const val CARD_TYPE_DEFAULT = "Мир"
const val MASTERCARD = "Mastercard"

fun calcTransfer(transferAmount: Int, cardType: String = CARD_TYPE_DEFAULT, prevTransfersAmount: Int = 0): Int {
    val limitDay = 150_000
    val limitMonth = 600_000

    val newTransferSum = transferAmount + prevTransfersAmount

    val fee: Int = if (transferAmount > limitDay
        || newTransferSum > limitMonth
    ) {
        -1
    } else {
        val nonFeeLimitMC = 75_000
        val feeAddMC = 20
        val feeRateMC = 0.006
        val feeRateDefault = 0.0075

        when (cardType) {
            CARD_TYPE_DEFAULT -> 0
            MASTERCARD -> {
                when {
                    (prevTransfersAmount > nonFeeLimitMC) -> (transferAmount * feeRateMC).toInt() + feeAddMC
                    (newTransferSum > nonFeeLimitMC)
                        -> ((newTransferSum - nonFeeLimitMC) * feeRateMC).toInt() + feeAddMC
                    else -> 0
                }
            }
            else -> (transferAmount * feeRateDefault).toInt()
        }
    }
    return fee
}

