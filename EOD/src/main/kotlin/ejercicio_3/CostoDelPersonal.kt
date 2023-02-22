package ejercicio_3


class CostoPersonal {
    fun costoDelPersonal(trabajadores: Array<Trabajador>): Double {
        var costoFinal = 0.00

        for (trabajador in trabajadores) {
           costoFinal += trabajadores.costo
        }
        return costoFinal
    }
}