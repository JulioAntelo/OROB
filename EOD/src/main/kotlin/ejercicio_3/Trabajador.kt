package ejercicio_3

open class Trabajador(private var nombre: String, var nomina: Double) {
    public var horasExtras: Int = 0

    open fun costo(): Double {
        var costoFinal = 0.00
        costoFinal += nomina + (horasExtras * 20)
        return costoFinal
    }
}
