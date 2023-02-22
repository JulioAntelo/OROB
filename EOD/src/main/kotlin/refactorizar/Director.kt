package refactorizar

class Director(nombre: String, nomina: Double) : Trabajador(nombre, nomina) {
     override fun costo(): Double {
         return nomina
    }
}