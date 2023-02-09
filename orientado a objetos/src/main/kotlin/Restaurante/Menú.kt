package Restaurante

class Menú ( IVA:Double =0.21,  Descuento:Float,  Bebidas:String,Principal:String, Postre:String){
    val Iva = IVA
    var descuento = Descuento
    var principal = Principal
    var bebidas = Bebidas
    var postre = Postre
    var DiccionarioComidas= mutableMapOf("Entrecot" to 15,
                                "Pez Espada" to 12,
                                "Carrillada" to 10,
                                "Dorada" to 20,
                                "Otros" to 13)

    var DiccionarioBebidas = mutableMapOf("Refresco" to 1,
                                            "Vino" to 1.5,
                                            "Otros" to 2)

    var DiccionarioPostres = mutableMapOf("Fruta" to 2,
                                            "Helado" to 3,
                                            "Otros" to 4)

    fun importe(): Double {
        var importe = 0
        println("que desea pedir para principal?")
        importe+=  DiccionarioComidas.getOrDefault(principal,13)

        println("que desea pedir para beber?")
        importe+=  DiccionarioComidas.getOrDefault(bebidas,2)

        println("que desea pedir de postre?")
        importe+=  DiccionarioComidas.getOrDefault(postre,4)

        var importeConIva = importe + (importe*Iva)
        return importeConIva
    }
}