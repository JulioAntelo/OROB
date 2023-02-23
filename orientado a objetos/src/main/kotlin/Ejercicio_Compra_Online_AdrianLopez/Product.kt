
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

}