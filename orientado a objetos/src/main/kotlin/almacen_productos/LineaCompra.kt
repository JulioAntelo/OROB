class LineaCompra(cant:Int, prod:Producto) {
    var cantidad:Int=cant
        get():Int{
            return field
        }
        set(value){
            if(value<0){
                println("Debe introducir un valor positivo ")
                field= readln().toInt()
            }
        }
    var producto:Producto=prod

    constructor():this(0,Producto("producto",0.0))

}