
abstract class Product(RegInitialPrice:Double) {

   protected var regularPrice:Double

     var iva = 0
         get():Int {
             return field
         }
        set(value){
            if(value !in tramosiva){
                println("valor no valido")

            }else
                field = value
        }
    public var codigo:Int
    companion object{
        private val tramosiva = intArrayOf(0,4,10,21)
        var contador = 0
    }

    init {
       regularPrice=RegInitialPrice
        codigo = contador
        contador++
   }

    constructor():this(1.0){
    }

    abstract fun computersaleprice():Double

    abstract fun Imprimir()

    abstract fun computeespecialcostumerPrice():Double

    fun mostrarContador():Int{
        return contador
    }
}