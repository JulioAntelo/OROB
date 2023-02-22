package ejercicio_3

class Subdirector(nombre: String, nomina: Float) :Trabajador(nombre, nomina) {
    override fun costoDelPersonal(Subdirectores: Array<Trabajador>): Float {
        var costoFinal = 0f

        for (subdirector in Subdirectores) {
            costoFinal +=nomina
        }
        return costoFinal
    }
}
