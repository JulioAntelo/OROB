package ejercicio_3

class Director(nombre: String, nomina: Float) :Trabajador(nombre, nomina) {
     override fun costoDelPersonal(): Float {
        var costoFinal = 0f
         costoFinal = nomina
         return costoFinal
    }
}