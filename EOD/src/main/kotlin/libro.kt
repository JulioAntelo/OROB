class Libro {
    var titulo: String = ""
    var editorial: String = ""
    var autor: String = ""
    var año_publicación: Int = 0

    fun imprimirInformaciónBásica() {
        println(titulo)
        println(editorial)
    }

    fun imprimirInformaciónCompleta() {
        println(titulo)
        println(editorial)
        println(autor)
        println(año_publicación)
    }
}
