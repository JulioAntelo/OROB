package ejercicio_3

class Trabajador(private var nombre: String, var nomina: Float) {
    public var horasExtras: Int = 0
    public var tipoTrabajador: Int = -1

    companion object {
        const val DIRECTOR: Int = 0
        const val SUBDIRECTOR: Int = 1
    }

    fun getNombre(): String {
        return nombre
    }

    fun setNombre(nombre: String) {
        this.nombre = nombre
    }

    fun getNomina(): Float {
        return nomina
    }

    fun setNomina(nomina: Float) {
        this.nomina = nomina
    }

    fun getHorasExtras(): Int {
        return horasExtras
    }

    fun setHorasExtras(horasExtras: Int) {
        this.horasExtras = horasExtras
    }

    fun getTipoTrabajador(): Int {
        return tipoTrabajador
    }

    fun setTipo(tipo: Int) {
        tipoTrabajador = tipo
    }
}




