import java.io.File

fun main(args: Array<String>) {

    fun main(args: Array<String>) {
        val file = File("patatas.txt")
        val bufferedReader = file.bufferedReader()
        val text: List<String> = bufferedReader.readLines()
        val wordfind=readln()
        var counter = 0
        for (line in text) {
            val words = line.split(" ", ",",":")
            for (word in words){
                if(word.equals(wordfind)){
                    counter +=1
                }
            }
        }
        print(counter)
    }
}