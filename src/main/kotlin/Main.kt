class Sun{
    companion object{
        fun getSun() = "Sun"
    }
}

object Singleton{
    val sun = Sun()
}

fun main(args: Array<String>) {
    val sun = Singleton.sun
    println(sun)
}