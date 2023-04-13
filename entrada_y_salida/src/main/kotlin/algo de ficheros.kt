import java.io.File


fun main(args: Array<String>) {

    fun main(args: Array<String>) {
        val file = File("patatas.txt")
        val bufferedReader = file.bufferedReader()
        val text: List<String> = bufferedReader.readLines()
        for (line in text) {
            println(line)
        }
    }
}