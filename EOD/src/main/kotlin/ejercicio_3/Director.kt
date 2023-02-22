package ejercicio_3

class Director(nombre: String, nomina: Float) :Trabajador(nombre, nomina) {
    override fun costoDelPersonal(Directores: Array<Trabajador>): Float {
        var costoFinal = 0f

        for (subdirector in Directores) {
            costoFinal +=nomina
        }
        return costoFinal
    }
}