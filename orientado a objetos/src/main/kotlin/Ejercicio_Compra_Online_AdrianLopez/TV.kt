class TV (RegInitialPrice:Double,Manufacturer:String,Size:Int):Electronic(RegInitialPrice, Manufacturer) {

    protected var size=0
         set(value){
             if (value<0){
                 print("Valor no valido")
                 field=1
             }
             else field=value
         }
    init {
        size=Size
    }

    constructor():this(80.0,"TV-Ventas",50)

    override fun computersaleprice(): Double {
        return regularPrice*0.8
    }

    override fun Imprimir() {
        println("Televisor con precio $regularPrice, proveniente de $manufacturer , un tamaño de $size pulgadas y precio final de ${computersaleprice()}")
    }

    override fun computeespecialcostumerPrice(): Double {
        return computersaleprice()-100.0
    }

}