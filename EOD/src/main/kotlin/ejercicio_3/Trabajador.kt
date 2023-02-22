package ejercicio_3

open class Trabajador(private var nombre: String, var nomina: Float) {
    public var horasExtras: Int = 0

    open fun costoDelPersonal(): Float {
        var costoFinal = 0f
        costoFinal += nomina + (horasExtras * 20)
        return costoFinal
    }
}
