package TiendaOnline

import Electronic

class Camera(RegInitialPrice:Double,Manufacturer:String,MegaPixeles:Int):Electronic(RegInitialPrice, Manufacturer) {

    var mgpi=0

    init {
        mgpi=MegaPixeles
        regularPrice=RegInitialPrice
        manufacturer=Manufacturer
    }

     constructor():this(50.0,"CamerasAdri",20)

    override fun Imprimir() {
        println("Camara con precio $regularPrice, proveniente de $manufacturer, una cantidad de $mgpi megapixeles , con un precio final de ${computersaleprice()} y precio de especialcostumer de ${computeespecialcostumerPrice()}")
    }

    override fun computersaleprice(): Double {
        return regularPrice*0.7
    }

    override fun computeespecialcostumerPrice(): Double {
        return computersaleprice()-205.00
    }

}