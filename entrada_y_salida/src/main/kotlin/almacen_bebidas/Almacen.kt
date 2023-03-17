package almacen_bebidas

class Almacen() {



    val Estanteria1:MutableList<Bebida> = mutableListOf()
    val Estanteria2:MutableList<Bebida> = mutableListOf()
    val Estanteria3:MutableList<Bebida> = mutableListOf()
    val Estanteria4:MutableList<Bebida> = mutableListOf()

    var Estanterias = mutableMapOf<Int, MutableList<Bebida>>(1 to Estanteria1, 2 to Estanteria2, 3 to Estanteria3, 4 to Estanteria4)



    fun PrecioTotal():Double{
        var preciototal = 0.0
        for ((key,value )in Estanterias){
            for (bebida in value){
                preciototal += bebida.Calcular(1)
            }
        }
        return preciototal
    }

    fun PrecioMarca(Marca:String):Double{
        var preciomarca:Double = 0.0
        for ((key,value )in Estanterias){
            for (bebida in value){
                if (bebida.m == Marca){
                    preciomarca += bebida.p
                }
            }
        }
        return preciomarca
    }

    fun PrecioEstanteria(numeroEstanteria:Int):Double{
        var precioestanteria:Double = 0.0
        val listaBebidasEstanteriaActual = Estanterias[numeroEstanteria]
                if (listaBebidasEstanteriaActual != null) {
                    for (bebida in listaBebidasEstanteriaActual) {
                        precioestanteria += bebida.p
                    }
                }
        return precioestanteria
    }


    fun AgregarProducto(Bebida: Bebida){
        var EstanteriaMasVacia:MutableList<Bebida> = mutableListOf()
        var Confirmación = false
        for ((key,value) in Estanterias){
           if (value.size <= EstanteriaMasVacia.size){
               EstanteriaMasVacia = value
               value.add(Bebida)
               Confirmación = true
               break
           }
        }
        if (Confirmación == true){
            println()
            println("Producto agregado en la estantería más vacía.")
        }else{
            val estanteriarandom = Estanterias[(1..Estanterias.size).random()]
            estanteriarandom!!.add(Bebida)
            println()
            println("Todas las estanterías tienen el mismo número de productos.")
            println("Producto agregado en cualquier estantería.")
        }
    }
    fun EliminarProducto(ID:Int):Boolean{
        var productoBorrado:Boolean = false
        for ((key,value )in Estanterias){
            for(bebida in value){
                if (bebida.ID == ID){
                    value.remove(bebida)
                    productoBorrado = true
                    break
                }
            }
        }
        return productoBorrado
    }

    fun Informacion(Bebida: Bebida){
        for ((key,value) in Estanterias){
            for (bebida in value){
                if(bebida == Bebida){
                    println(bebida)
                }
            }
        }
    }

    fun InformacionAlmacen(){
        for ((NumEstanteria,Estanteria) in Estanterias){
            println()
            print("------Estantería $NumEstanteria------")
            if (Estanteria.isEmpty()){
                println("\nEstantería vacía.")
                println()
            }
            for (bebida in Estanteria){
                Informacion(bebida)
            }
        }
    }
    fun borrarEstanteria(Estanteria: Int){
        println()
        println("Borrando estantería......")
        println()
        if (Estanteria in Estanterias){
            Estanterias.remove(Estanteria)
            println("Estantería $Estanteria borrada.")
        }else{
            println("No existe esa estantería.")
        }
    }

    fun recolocarBebida(ID: Int){
        var Confirmacion = false

        println("Recolocando bebida....")
        for ((NumEstanteria,Estanteria) in Estanterias){
            for (bebida in Estanteria){
                if (bebida.ID == ID){
                    EliminarProducto(bebida.ID)
                    AgregarProducto(bebida)
                    println()
                    println("Bebida recolocada en la estantería más vacía")
                    Confirmacion = true
                    break
                }else{
                    println()
                    println("No existe esa bebida")
                }

            }
            if (Confirmacion == true){break}
        }
    }

    fun borrarMarca(Marca:String) {
        println()
        println("........Borrando marca........")
        println()
        for ((k, Estanterias) in Estanterias) {
            Estanterias.removeIf{it.m==Marca}
        }
    }


}