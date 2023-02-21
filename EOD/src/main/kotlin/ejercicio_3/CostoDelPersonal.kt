package ejercicio_3

class CostoPersonal {
    fun costoDelPersonal(trabajadores: Array<Trabajador>): Float {
        var costoFinal = 0f

        for (trabajador in trabajadores) {
            if (trabajador.tipoTrabajador == Trabajador.DIRECTOR || trabajador.tipoTrabajador == Trabajador.SUBDIRECTOR) {
                costoFinal += trabajador.nomina
            } else {
                costoFinal += trabajador.nomina + (trabajador.horasExtras * 20)
            }
        }
        return costoFinal
    }
}