package refactorizar

class Compra(var nomProd: String, var tipoProd: Int, var cant: Int, var precioProd: Double) {
    companion object {
        const val HARDWARE = 0
        const val SOFTWARE = 1
        const val OTRO = 2
    }

    fun getNomProd(): String {
        return nomProd
    }

    fun setNomProd(nomProd: String) {
        this.nomProd = nomProd
    }

    fun getTipoProd(): Int {
        return tipoProd
    }

    fun setTipoProd(tipoProd: Int) {
        this.tipoProd = tipoProd
    }

    fun getCant(): Int {
        return cant
    }

    fun setCant(cant: Int) {
        this.cant = cant
    }

    fun getPrecioProd(): Double {
        return precioProd
    }

    fun setPrecioProd(precioProd: Double) {
        this.precioProd = precioProd
    }
}

