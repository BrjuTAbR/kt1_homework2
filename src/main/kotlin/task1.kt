val MIN = 60U
val HOUR = MIN * MIN
val DAY = 24U * HOUR

fun agoToText(agoTime: UInt): String {
    val preStr = "был(а) "

    return preStr + when {
        agoTime < MIN -> "только что"
        agoTime < HOUR -> "${(agoTime / MIN).toInt()} ${getWordMin((agoTime / MIN).toInt())} назад"
        agoTime < DAY -> "${(agoTime / HOUR).toInt()} ${getWordHour((agoTime / HOUR).toInt())} назад"
        agoTime < 2U * DAY -> "вчера"
        agoTime < 3U * DAY -> "позавчера"
        else -> "давно"
    }
}

fun getWordMin(minutes: Int): String {
    val word = "минут"
    return if (minutes > 10 && minutes < 20) {
        word
    } else {
        word + when (minutes % 10) {
            1 -> "у"
            2, 3, 4 -> "ы"
            else -> ""
        }
    }
}

fun getWordHour(hour: Int): String {
    val word = "час"
    return word + when {
        (hour >= 5 && hour <= 20) -> "ов"
        (hour % 10 == 1) -> ""
        else -> "a"
    }
}


