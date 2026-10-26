fun main() {
    //Задача 1
    println("Введите сумму перевода в рублях:")
    val summaPerevoda = readLine()!!.toDouble()

    val komissiya = summaPerevoda * 0.0075 // 0.75% от суммы
    var itogKomissii = komissiya

    if (komissiya < 35) { // минимальная комиссия 35 рублей
        itogKomissii = 35.0
    }

    println("Комиссия за перевод $summaPerevoda руб. = $itogKomissii руб.")

    //Задача 2
    println("Введите количество лайков:")
    val kolichestvoLaikov = readLine()!!.toInt()

    val okonchanie = when {
        kolichestvoLaikov % 100 in 11..14 -> "людям"
        kolichestvoLaikov % 10 == 1 -> "человеку"
        kolichestvoLaikov % 10 in 2..4 -> "человека"
        else -> "людям"
    }
    println("Понравилось $kolichestvoLaikov $okonchanie")

    //Задача 3
    println("Введите сумму покупки в рублях:")
    val summaPokupki = readLine()!!.toDouble()

    println("Вы постоянный клиент? (да/нет):")
    val otvetKlienta = readLine()!!
    val postoyannyiKlient = otvetKlienta == "да"

    var skidka = 0.0

    if (summaPokupki > 10000) {
        skidka = summaPokupki * 0.05 // 5% скидка
    } else if (summaPokupki > 1000) {
        skidka = 100.0 // фикс. 100 рублей
    }

    val cenaSoSkidkoi = summaPokupki - skidka

    val itog: Double
    if (postoyannyiKlient) {
        itog = cenaSoSkidkoi * 0.99 // минус ещё 1% сверху
    } else {
        itog = cenaSoSkidkoi
    }

    println("К оплате: $itog руб.")
}