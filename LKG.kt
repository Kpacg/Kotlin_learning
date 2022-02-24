fun readNaturalNumber():Int{
    var NaturalNumber = 0
    while(NaturalNumber < 1)
    {
        try {
            NaturalNumber = readLine()!!.toInt()
            if(NaturalNumber < 0)
                throw Exception("Кто-то слишком умный!")
        }
        catch (e:Exception)
        {
            println("Кажется, ты ошиблась, попробуй ещё раз!")
        }
    }
    return NaturalNumber
}

private fun LKG() {
    val a = 567
    val b = 91223
    var x: Int

    println("Привет, Юля! Сколько случайных (или не очень) чисел ты хотела бы получить?")
    val amountOfNumbers: Int = readNaturalNumber()

    println(
        "Отлично, осталось выбрать начальную точку! Я бы хотел, чтобы это было целое положительное число. " +
                "Не держи зла :3"
    )
    x = readNaturalNumber()

    println("Поехали!")

    for (i in 1..amountOfNumbers) {
        x = a * x + b
        println("$x")
    }

    println("Всё!")
}

fun main(){
    LKG()
}

