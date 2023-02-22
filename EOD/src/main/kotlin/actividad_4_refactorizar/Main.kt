package actividad_4_refactorizar


fun main() {
    val pelicula1 = Pelicula("Madagascar", Pelicula.INFANTIL)
    val alquiler1 = Alquiler(pelicula1, 6) // 6 day rental
    val pelicula2 = Pelicula("Star Wars", Pelicula.ESTRENO)
    val alquiler2 = Alquiler(pelicula2, 2) // 2 day rental
    val pelicula3 = Pelicula("Gone with the Wind", Pelicula.REGULAR)
    val alquiler3 = Alquiler(pelicula3, 8) // 8 day rental
    val cliente1 = Cliente("David")
    cliente1.agregarAlquiler(alquiler1)
    cliente1.agregarAlquiler(alquiler2)
    cliente1.agregarAlquiler(alquiler3)
    val extracto = cliente1.extracto()
    println(extracto)
}
