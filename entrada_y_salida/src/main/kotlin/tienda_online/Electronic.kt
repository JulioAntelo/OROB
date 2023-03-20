
abstract class Electronic(RegInitialPrice:Double,Manufacturer:String):Product(RegInitialPrice) {

   protected var manufacturer=""

    init {
        manufacturer=Manufacturer
    }

    constructor():this(1.0,"Principal")

    override fun Imprimir(){}
}