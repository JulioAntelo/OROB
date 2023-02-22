package actividad_4_refactorizar

class Pelicula(val titulo: String, val codigoPrecio: Int) {



    companion object { //compartir valores
        const val INFANTIL = 2
        const val ESTRENO = 1
        const val REGULAR = 0
    }

}
