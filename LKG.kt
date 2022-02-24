fun readNaturalNumber():Int{
    var naturalNumber = 0
    while(naturalNumber < 1)
    {
        try {
            naturalNumber = readLine()!!.toInt()
            if(naturalNumber < 0)
                throw Exception("Кто-то слишком умный!")
        }
        catch (e:Exception)
        {
            println("Кажется, ты ошиблась, попробуй ещё раз!")
        }
    }
    return naturalNumber
}

private fun linearGenerator() {
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
    linearGenerator()
}

