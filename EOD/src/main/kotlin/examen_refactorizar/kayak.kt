package examen_refactorizar

class kayak(plazas:Int):Embarcación(plazas) {
    var plazas = plazas
    var precio = 2
    public override fun CalcularCosteTotal(horas:Int): Int {
        return horas*precio
    }

    override fun toString(): String {
        return "kayak(plazas=$plazas, precio=$precio)"
    }

}