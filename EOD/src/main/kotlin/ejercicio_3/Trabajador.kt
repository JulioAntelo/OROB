package ejercicio_3

open class Trabajador(private var nombre: String, var nomina: Float) {
    public var horasExtras: Int = 0

    open fun costoDelPersonal(trabajadores: Array<Trabajador>): Float {
        var costoFinal = 0f

        for (trabajador in trabajadores) {
            costoFinal += nomina + (horasExtras * 20)
        }
        return costoFinal
    }

}
