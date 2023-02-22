package ejercicio_3

class Subdirector(nombre: String, nomina: Float) :Trabajador(nombre, nomina) {
    fun costoDelPersonal(Subdirectores: Array<Subdirector>): Float {
        var costoFinal = 0f

        for (subdirector in Subdirectores) {
            costoFinal +=nomina
        }
        return costoFinal
    }
}
