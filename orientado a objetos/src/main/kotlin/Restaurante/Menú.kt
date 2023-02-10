package Restaurante

class Menú(IVA:Double =0.21, Descuento: Double, Principal:String, Bebidas:String, Postre:String){
    val Iva = IVA
    var descuento = Descuento
    var principal = Principal
    var bebidas = Bebidas
    var postre = Postre
    var DiccionarioComidas= mutableMapOf("Entrecot" to 15.0,
                                "Pez Espada" to 12.0,
                                "Carrillada" to 10.0,
                                "Dorada" to 20.0,
                                "Otros" to 13.0)

    var DiccionarioBebidas = mutableMapOf("Refresco" to 1.0,
                                            "Vino" to 1.5,
                                            "Otros" to 2.0)

    var DiccionarioPostres = mutableMapOf("Fruta" to 2.0,
                                            "Helado" to 3.0,
                                            "Otros" to 4.0)

    fun importe(): Double {
        var importe = 0
        println("que desea pedir para principal?")
        importe =  (DiccionarioComidas.getOrDefault(principal,13) +
                   DiccionarioBebidas.getOrDefault(bebidas,2) +
                   DiccionarioPostres.getOrDefault(postre,4))
        var importeConIva = importe + (importe*Iva)
        return (importeConIva -(importeConIva*descuento))
    }

}