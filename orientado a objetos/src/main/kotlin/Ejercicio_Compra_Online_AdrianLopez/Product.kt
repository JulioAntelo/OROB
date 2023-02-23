
abstract class Product(RegInitialPrice:Double) {

   protected var regularPrice:Double

   init {
       regularPrice=RegInitialPrice
   }

    constructor():this(1.0){
    }

    abstract fun computersaleprice():Double

    abstract fun Imprimir()

    abstract fun computeespecialcostumerPrice():Double

    companion object Iva{
        val iva = intArrayOf(0,4,10,21)
        init {
            println("Inicializando el companion")
        }
        fun IvaMenor():Int {
            return iva[0]
        }
        fun IvaMeioMenor():Int {
            return iva[1]
        }
        fun IvaMedioMayor():Int {
            return iva[2]
        }
        fun IvaMayor():Int {
            return iva[3]
        }
    }
}