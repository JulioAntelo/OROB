class MP3Player(RegInitialPrice:Double,Manufacturer:String,Color:String):Electronic(RegInitialPrice, Manufacturer) {

    protected var color=""

    init {
        color=Color
        regularPrice=RegInitialPrice
        manufacturer=Manufacturer
    }

    constructor():this(12.0,"mp3forever","blue")


    override fun Imprimir() {
        println("Mp3 con precio de $regularPrice, con fabricante $manufacturer de color $color, y precio final de ${computersaleprice()}, el precio de specialcostumerprice ${computeespecialcostumerPrice()}")
    }

    override  fun computersaleprice():Double{
        return regularPrice*0.9
    }

    override fun computeespecialcostumerPrice(): Double {
        return computersaleprice()-15
    }

}