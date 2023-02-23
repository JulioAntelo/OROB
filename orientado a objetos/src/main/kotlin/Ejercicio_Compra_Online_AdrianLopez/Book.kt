class Book(RegInitialPrice:Double,Publisher:String,YearPublished:Int):Product(RegInitialPrice) {

   protected var publisher=""

   protected var yearpublished=0

   init {
       publisher=Publisher
       yearpublished=YearPublished
       regularPrice=RegInitialPrice
   }

    constructor():this(25.0,"AdrianAckerman",2023)

    override fun computersaleprice(): Double {
        return regularPrice*0.5
    }

    override fun Imprimir() {
        println("Libro con precio de $regularPrice, publicado en el año $yearpublished y autor de libro $publisher con precio final de ${computersaleprice()} y precio de especialcostumer de ${computeespecialcostumerPrice()}")
    }

    override fun computeespecialcostumerPrice(): Double {
       return computersaleprice()-2.00
    }

}